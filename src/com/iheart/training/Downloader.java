package com.iheart.training;

//Not safe for threads
public class Downloader {

    //eager version
    private static Downloader downloader = new Downloader();

    private Downloader(){

    }
    public void startDownloading(){
        System.out.println("Start downloading data from the web.....");
    }

//    public static Downloader getInstance(){
//        return Downloader.downloader;
//    }

    //lazy version
    public static Downloader getInstance(){
        if(downloader == null)
            downloader = new Downloader();
        return Downloader.downloader;
    }
}
