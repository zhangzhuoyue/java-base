package field;

import com.sun.org.apache.regexp.internal.REUtil;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectAnalyer
 *
 * @author Administrator
 * @desc 使用反射实现公共的toString
 * @time 2020/7/16 14:14
 **/
public class ObjectAnalyer {

    private List<Object> visited = new ArrayList<Object>();

    /**
     * 通过反射实现公共的toString()
     *
     * @param obj
     * @return
     */
    public String toString(Object obj) {
        if (obj == null) return "null";
        if (visited.contains(obj)) return "...";
        visited.add(obj);
        Class<?> cl = obj.getClass();
        //String类型，直接返回
        if (cl ==  String.class) return (String) obj;
        //判断数组类型
        if (cl.isArray()){
            String r = cl.getComponentType() +"[]{"; //获取数组元素的类型
            for (int i = 0; i < Array.getLength(obj) ;i++){//Array.getLength(obj)使用反射获取数组成都
                if (i > 0) r += ",";
                Object val = Array.get(obj, i);  //使用反射给数组对象设置值
                if (cl.getComponentType().isPrimitive()) //判断数组元素类型是否是基本数据类型，如果是基本数据类型则不需要进一步解析
                    r += val;
                else r += toString(val); //如果数组元素是引用数据类型，使用递归继续解析
            }
            return r +")";
        }
        String r = cl.getName();
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true); //批量的给对象中所有的元素赋给权限
            for (Field field : fields){

                if (!Modifier.isStatic(field.getModifiers())){ //判断当前域是不是静态
                    if (!r.endsWith("[")) r +=",";
                    r += field.getName() + "=";             //获取成员名称

                    try {
                        Class<?> type = field.getType();  //获取成员的类型
                        Object val = field.get(obj);//获取成员值
                        if (type.isPrimitive()) r += val;
                        else r += toString(val);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        }while ( cl != null);
        return r;
    }
}
