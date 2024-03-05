package com.example;

public class Teh4 {
    public void matr(){
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
}
