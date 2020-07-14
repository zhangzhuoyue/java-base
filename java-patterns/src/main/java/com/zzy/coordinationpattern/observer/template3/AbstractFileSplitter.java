package com.zzy.coordinationpattern.observer.template3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyue666
 * @description  将观察者抽离出来
 * @date 2020/7/14 23:45
 */
public abstract class AbstractFileSplitter {

    //要支持多个通知，则将通知放在list集合中
    private List<IProgress> iProgressList = new ArrayList<>();
    /**
     * 添加具体的通知控件
     * @param iProgress
     */
    public void addIProgress(IProgress iProgress) {
        iProgressList.add(iProgress);
    }

    /**
     * 移除控件
     */
    public void removeIProgress(IProgress iProgress){
        iProgressList.remove(iProgress);
    }

    /**
     * 将方法调用抽出来
     * @param percentage
     */
    protected void onProgress(double percentage) {
        //将控件进行迭代，发送通知
        for(IProgress iProgress : iProgressList){
            if (iProgress == null) {
                iProgress.dprogress(percentage);
            }
        }
    }
}
