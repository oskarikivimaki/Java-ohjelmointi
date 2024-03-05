package com.example;
import java.util.ArrayList;

public class Teh8 {
    public void prime(){
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        int num = 10;
    
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                primeNumbers.add(i);
            }
        }

        for ( int j = 0; j < primeNumbers.size(); j++){
            System.out.println(primeNumbers.get(j));
        }
    }
}
