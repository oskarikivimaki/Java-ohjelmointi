package com.example.Teh18;

public class Audio extends Exfile {
    public Audio(String loc){
        super(loc, Filetype.AUDIO);
    }
    

    @Override
    public void openFile(){
        System.out.println("Opening audio file...");
    }

    @Override
    public void closeFile(){
        System.out.println("Closing audio file...");
    }
}