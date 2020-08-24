package com.zzy.performance_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyue666
 * @description  享元工厂
 * @date 2020/8/16 21:18
 * 享元模式：将已经创建的对象存储起来，重复使用
 */
public class FlyWeight {

    private Map<String,Font> fontMap = new HashMap<>();//对象池

    public Font getFont(String key){
        Font font = fontMap.get(key);
        if (font != null){
            return font;
        }else {
            Font font1 = new Font(key);
            fontMap.put(key,font1);
            return font1;
        }
    }

    public void clear(){
        //清除缓存内容
    }
}
