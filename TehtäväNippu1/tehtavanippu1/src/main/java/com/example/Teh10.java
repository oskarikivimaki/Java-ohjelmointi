package com.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Teh10 {
    public HashMap<String, ArrayList<Integer>> random(){
        Random rand = new Random();
        HashMap<String, ArrayList<Integer>> Store = new HashMap<String, ArrayList<Integer>>();

        Store.put("zero", new ArrayList<Integer>());
        Store.put("positive", new ArrayList<Integer>());
        Store.put("negative", new ArrayList<Integer>());

        for(int i = 0; i < 100; i++){
            int tmp = rand.nextInt(50 - (-50) + 1) + (-50);

            if(tmp == 0){
                Store.get("zero").add(tmp);
            } else if(tmp > 0){
                Store.get("positive").add(tmp);
            } else {
                Store.get("negative").add(tmp);
            }
        }

        return(Store);
    }    
}
