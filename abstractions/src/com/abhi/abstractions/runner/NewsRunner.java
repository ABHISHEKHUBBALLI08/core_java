package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Media;
import com.abhi.abstractions.internal.News;
import com.abhi.abstractions.internal.SocialMedia;

public class NewsRunner {
    public static void main(String[] args) {
        Media media=new SocialMedia();
        Media media1=new News();
        NewsUpdate newsUpdate=new NewsUpdate(media);
        newsUpdate.mediaInfo();
        NewsUpdate newsUpdate1=new NewsUpdate(media1);
        newsUpdate1.mediaInfo();
    }
}
