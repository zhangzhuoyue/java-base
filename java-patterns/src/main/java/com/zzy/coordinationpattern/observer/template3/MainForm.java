package com.zzy.coordinationpattern.observer.template3;


/**
 * @author zhangyue666
 * @description
 * @date 2020/7/14 22:04
 */
public class MainForm {
    //文件地址
    private String filePath;
    //分割数量
    private int fileNumber;
    //具体的通知控件
    //private ProgressBar progressBar;

    //文件分割
    public void buttonClick(){
       FileSplitter fileSplitter = new FileSplitter(filePath,fileNumber);
       //添加通知
        fileSplitter.addIProgress(new WinNotify());
        fileSplitter.addIProgress(new ConsoleNotify());
        fileSplitter.split();
    }

}
