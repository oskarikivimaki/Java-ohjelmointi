package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // System.out.println(cords(new double[]{0,0}, new double[]{0,3}));

        // tree();
        
        // Calc Obj = new Calc();
        // System.out.println(Obj.circle());
        // System.out.println(Obj.square());
        // System.out.println(Obj.rTriangle());

        // matr();
        // System.out.println(Arrays.toString(bubbleSort()));
        palindrome();
    }

    static double cords(double loc1[], double loc2[]){
        return Math.sqrt((Math.pow((loc1[0] - loc1[1]), 2)) + (Math.pow((loc2[0] - loc2[1]), 2)));
    }

    static void tree(){
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

    static void charPr(int count, char symbol, boolean newLine){
        for(int x = 0; x < count; x++){
            System.out.print(symbol);
        }
        if (newLine) {
            System.out.println();
        }
    }

    static void matr(){
        int[][] matrix = {
            {1, 5, 7},
            {9, 3, 1},
            {0, 1, 1}
        };

        int max = matrix[0][0];
        int[] awnser = {0, 0};

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                    awnser[0] = row;
                    awnser[1] = col;
                }
            }
        }
        System.out.println(String.format("[%d, %d]", awnser[0], awnser[1]));
        
    }

    static int[] bubbleSort() {
        int[] ogArray = {8, 3, 2, 7};
        int[] newArray = ogArray.clone();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return newArray;
    }

    static Boolean palindrome(){
        String word = "Saippuakauppias";

        char[] pali = word.toCharArray();
        char[] reverse = {};

        for (int i = pali.length-1; i >= 0; i--){
            reverse[i] = pali[i];
        }
        
        for(int j = 0; j < reverse.length; j++){
            System.out.print(reverse[j]);
        }
        return true;
    }
}