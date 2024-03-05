package com.example;

public class Teh2 {
    public void tree(){
        int korkeus = 5;
        int x = korkeus;
        int y = -1;
        for(int i = -1; i < korkeus; i++){
            charPr(x, ' ', false);
            charPr(y, '*', true);
            x--;
            y = y + 2;
        }
    }

    public void charPr(int count, char symbol, boolean newLine){
        for(int x = 0; x < count; x++){
            System.out.print(symbol);
        }
        if (newLine) {
            System.out.println();
        }
    }
}
