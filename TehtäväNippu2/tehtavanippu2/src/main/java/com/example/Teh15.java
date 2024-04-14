package com.example;

public class Teh15 {
    private static Teh15 instance;
    public String track;

    private Teh15(){}

    public static Teh15 getInstance(){
        if(instance == null) {instance = new Teh15();}
        return instance;
    }
    
    public static void setTrack(String biisi){
        getInstance().track = biisi;
    }
    public static String playTrack(){
        return getInstance().track;
    }
}
