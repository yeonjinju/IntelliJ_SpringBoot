package com.example.Boot01_Hello2.util;

public class TvRemocon implements Remocon{
    @Override
    public void up() {
        System.out.println("채널을 올려요!");
    }

    @Override
    public void down() {
        System.out.println("채널을 내려요!");
    }
}
