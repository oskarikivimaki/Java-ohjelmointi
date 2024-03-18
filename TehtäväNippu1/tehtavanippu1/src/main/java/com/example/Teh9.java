package com.example;

public class Teh9 {
    public String time(){
        int seconds = 3661, minutes = seconds / 60, hours = minutes / 60;

        int hpros = minutes % 60;
        int mpros = seconds % 60;

        String s = String.format("%02d", mpros);
        String m = String.format("%02d", hpros);
        String h = String.format("%02d", hours);

        String text = h + ":" + m + ":" + s;

        return(text);
    }
}
