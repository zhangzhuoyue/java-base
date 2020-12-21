package useAnnocation;

import annocation.FruitColor;
import annocation.FruitName;

import java.lang.reflect.Field;

/**
 * 注解处理器
 */
public class FruitInfoUtils {

    public static void getFruitInfro(Class<?> clazz) {
        String strFruitName = "水果名称: ";
        String strFruitColoe = "水果颜色: ";
        String strFruitProvicer = "供应商信息: ";

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.fruitName();
                System.out.println(strFruitName);
            }else if (field.isAnnotationPresent(FruitColor.class)){
              // field.getAnnotation(f)
            }
        }
    }

}
