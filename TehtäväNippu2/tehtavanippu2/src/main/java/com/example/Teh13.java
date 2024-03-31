package com.example;
import java.io.File;

public class Teh13 {
    public long haku(File folder){
        long length = 0;
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    length += file.length();
                } else {
                    length += haku(file);
                }
            }
        }
        return length;
    }
}
