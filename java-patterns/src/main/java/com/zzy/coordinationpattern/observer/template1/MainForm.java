package com.zzy.coordinationpattern.observer.template1;

/**
 * @author zzy
 * @description 文件分割类【目标对象】
 * @date 2020/7/12 22:33
 */

/**
 * 需求描述：在分割大文件需要的时间比较长，这个时候再操作界面提供一个进度条
 */
public class MainForm {
    //文件路径
    private String filePath;
    //文件分割数量
    private int fileNumber;
    //进度条
    private ProgressBar progressBar;

    public MainForm(int fileNumber,String filePath,ProgressBar progressBar){
        this.fileNumber = fileNumber;
        this.filePath = filePath;
        this.progressBar = progressBar;
    }

    //文件分割
    public void buttonClick(){
        FileSplitter fileSplitter = new FileSplitter(fileNumber, filePath,progressBar);
        fileSplitter.splitter();
    }
}
