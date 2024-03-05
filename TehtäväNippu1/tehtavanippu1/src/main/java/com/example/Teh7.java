package com.example;

public class Teh7 {
    public void fibo(){
    int n = 4;

    double first = Math.pow((1 + Math.sqrt(5)) / 2, n);

    double second = Math.pow((1 - Math.sqrt(5)) / 2, n);

    double F = 1/Math.sqrt(5) * (first - second);

    int newF = (int)F;

    System.out.println(newF);
    }
}
