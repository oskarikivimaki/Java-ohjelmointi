package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(cords());
    }

    static double cords(){
        int loc1[] = {0,0};
        int loc2[] = {0,3};

        return Math.sqrt((Math.pow((loc1[0] - loc1[1]), 2)) + (Math.pow((loc2[0] - loc2[1]), 2)));
        
    }
}