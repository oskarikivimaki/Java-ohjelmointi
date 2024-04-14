package com.example;

public class Teh16 {
    public int missingNum(int[] arr){
        int temp = arr[0];
        int missing = temp;

        for(int i = 0; i < arr.length; i++){
            if(temp + 1 == arr[i]){
                temp = arr[i];
            } else {
                missing = temp + 1;
            }
        }
        return missing;
    }
}
