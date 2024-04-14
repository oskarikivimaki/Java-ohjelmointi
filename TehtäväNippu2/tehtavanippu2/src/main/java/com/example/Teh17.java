package com.example;

public class Teh17 {
    public String wordreverser(String word){
        char[] store = word.toCharArray();
        String reversed = "";
        int x = 1;

        for(int i = 0; i < store.length; i++){
            reversed = reversed + store[store.length - x];
            x += 1;
        }

        return reversed;
    }
}