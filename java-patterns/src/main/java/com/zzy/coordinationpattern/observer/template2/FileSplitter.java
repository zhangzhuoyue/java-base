package com.zzy.coordinationpattern.observer.template2;

/**
 * @author zhangyue666
 * @description 分割文件主题【稳定】，只支持单个通知，并不是真正的观察者设计模式
 * @date 2020/7/14 21:42
 */

public class FileSplitter {
    //文件地址
    private String filePath;
    //分割数量
    private int fileNumber;
    //引入抽象通知机制
    private IProgress iProgress;

    public FileSplitter(String filePath, int fileNumber, IProgress iProgress) {
        this.fileNumber = fileNumber;
        this.filePath = filePath;
        this.iProgress = iProgress;
    }

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

    //将方法调用抽出来
    protected void onProgress(double percentage) {
        if (iProgress == null) {
            iProgress.dprogress(percentage);
        }
    }
}
