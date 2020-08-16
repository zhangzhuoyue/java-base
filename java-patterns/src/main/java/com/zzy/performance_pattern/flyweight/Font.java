package com.zzy.performance_pattern.flyweight;

/**
 * @author zhangyue666
 * @description 字体
 * @date 2020/8/16 21:17
 */
public class Font {
    private String key;

    public Font(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
