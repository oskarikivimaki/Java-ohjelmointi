package com.example;
import java.util.ArrayList;

public class Teh8 {
    public ArrayList<Integer> prime(){
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        int num = 10;
        
        for (int i = num/2; i < num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) break;

                if (j == i-1)primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}
