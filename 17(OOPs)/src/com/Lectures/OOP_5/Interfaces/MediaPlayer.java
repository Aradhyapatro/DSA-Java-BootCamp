package com.Lectures.OOP_5.Interfaces;

public class MediaPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Started");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    public static void main(String[] args) {
        MediaPlayer m=new MediaPlayer();
        m.start();
        m.stop();
    }
}
