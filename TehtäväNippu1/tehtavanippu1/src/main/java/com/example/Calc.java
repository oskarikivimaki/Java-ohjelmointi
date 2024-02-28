package com.example;

public class Calc {
    public double circle(){
        double radius = 2;
        return Math.PI * Math.pow(radius, 2);
    }

    public double square(){
        double lenght = 2;
        return Math.pow(lenght, 2);
    }

    public double rTriangle(){
        double leg1 = 2;
        double leg2 = 3;
        return (leg1 * leg2) / 2;
    }
}
