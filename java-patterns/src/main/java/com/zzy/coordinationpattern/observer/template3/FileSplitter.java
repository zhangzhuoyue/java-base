package com.zzy.coordinationpattern.observer.template3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyue666
 * @description 分割文件主题【稳定】，实现真正的观察者设计模式，支持多个观察者
 * @date 2020/7/14 21:42
 */

public class FileSplitter extends AbstractFileSplitter{
    //文件地址
    private String filePath;
    //分割数量
    private int fileNumber;

    /*引入抽象通知机制
    private IProgress iProgress;//只支持单个通知*/



    public FileSplitter(String filePath, int fileNumber) {
        this.fileNumber = fileNumber;
        this.filePath = filePath;
    }

    /**
     * 文件分割，并发送多个通知
     */
    public void split() {
        //1.文件分割
        //2.进度通知
        for (int i = 0; i < fileNumber; i++) {
            //计算分割百分比
            float floatFileNumber = fileNumber;
            float percentage = (i + 1) / floatFileNumber;
            onProgress(percentage);
        }
    }

}
