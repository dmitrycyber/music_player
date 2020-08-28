package com.example.my_web_app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        MusicPlayer firstPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);

        MusicPlayer secondPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println(firstPlayerBean.getVolume());
        secondPlayerBean.setVolume(12);
        System.out.println(firstPlayerBean.getVolume());

        context.close();
    }
}
