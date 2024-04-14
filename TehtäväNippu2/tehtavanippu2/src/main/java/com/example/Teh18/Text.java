package com.example.Teh18;

public class Text extends Exfile{
    public Text(String loc){
        super(loc, Filetype.TEXT);
    }

    @Override
    public void openFile(){
        System.out.println("Opening text file...");
    }

    @Override
    public void closeFile(){
        System.out.println("Closing text file...");
    }
}
