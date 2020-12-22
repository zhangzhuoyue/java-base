package useAnnocation;

import annocation.FruitColor;
import annocation.FruitName;
import annocation.FruitProver;

import java.lang.reflect.Field;


/**
 * 这种注释叫做文档注释
 * @author 类的作者
 * @version 1.1
 * @param 对方法的说明，比如功能介绍，参数解释
 * @return 对返回值说明
*/
public class FruitInfoUtils {

    /**
     * 方法外部
     * @param clazz
     */
    public static void getFruitInfro(Class<?> clazz) {
        String strFruitName = "水果名称: ";
        String strFruitColoe = "水果颜色: ";
        String strFruitProvicer = "供应商信息: ";

        Field[] fields = clazz.getDeclaredFields();
        /**
         * 方法内部
         */
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.fruitName();
                System.out.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                FruitColor.Color color = fruitColor.fruitColor();
                System.out.println(strFruitColoe+color.toString());
            } else if (field.isAnnotationPresent(FruitProver.class)) {
                FruitProver fruitProver = field.getAnnotation(FruitProver.class);
                System.out.println(strFruitProvicer + fruitProver.id() + fruitProver.name() + fruitProver.address());
            }
        }
    }

}
