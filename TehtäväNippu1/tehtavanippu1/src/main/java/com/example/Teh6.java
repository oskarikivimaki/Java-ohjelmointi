package com.example;

public class Teh6 {
    public Boolean palindrome(){
        String word = "Saippuakauppias";

        word = word.toLowerCase();
        word = word.replaceAll("\\s+", "");
        char[] pali = word.toCharArray();
        char[] reverse = new char[pali.length];

        for (int i = pali.length-1, h = 0; i >= 0; i--, h++){
            reverse[h] = pali[i];
        }

        String finalword = new String(reverse);

        
        
        if (word.equals(finalword)) {
            return true;
        } else {
            return false;
        }
    }
}
