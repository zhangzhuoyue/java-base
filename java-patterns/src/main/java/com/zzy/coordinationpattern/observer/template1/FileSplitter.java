package com.zzy.coordinationpattern.observer.template1;

/**
 * @author zhangyue666
 * @description 文件分割对象
 * @date 2020/7/12 22:38
 */
public class FileSplitter {
    //分割文件数量
    private int fileNumber;
    //文件路径
    private String filePath;
    //进度条
    private ProgressBar progressBar;

    public FileSplitter(int fileNumber,String filePath,ProgressBar progressBar){
        this.fileNumber = fileNumber;
        this.filePath = filePath;
        this.progressBar = progressBar;
    }

    //文件分割
    public  void splitter(){
        //1.读取文件

        //分批次向小文件中写入数据
        for (int i = 0;i < fileNumber ;i++){
            //1.文件分割

            //2.更新进度条
            if (progressBar != null) //如果传入进度条对象，则执行进度条更新，如果没有传递，则直接进行文件分割
            progressBar.refreshProgressBar((i+1)/Double.valueOf(fileNumber));
        }

    }
}
