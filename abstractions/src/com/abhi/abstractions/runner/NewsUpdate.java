package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Media;


public class NewsUpdate {
    private Media media;
    public NewsUpdate(Media media){
        this.media=media;
        System.out.println("media running..");
    }
    public void mediaInfo(){
        if(this.media!=null){
            this.media.info();
        }else{
            System.out.println("media is null");
        }
    }
}
