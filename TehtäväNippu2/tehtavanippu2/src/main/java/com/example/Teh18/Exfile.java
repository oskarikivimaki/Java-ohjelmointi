package com.example.Teh18;

abstract class Exfile {

    protected String location;

    protected Filetype fileType;

    public abstract void openFile();
    public abstract void closeFile();

    public String getterLoc(){
        return location;
    }

    public Filetype getterFt(){
        return fileType;
    }
    public Exfile(String loc, Filetype ft){
        location = loc;
        fileType = ft;
    }
}