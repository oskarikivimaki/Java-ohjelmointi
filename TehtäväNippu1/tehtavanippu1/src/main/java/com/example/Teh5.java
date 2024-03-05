package com.example;

public class Teh5 {
    public int[] bubbleSort() {
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
}
