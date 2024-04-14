package com.example;
import java.io.File;
import com.example.Teh14.*;
import com.example.Teh18.*;

public class Main {

    public static void main(String[] args) {
        Teh11 teh11 = new Teh11();
        Teh12 teh12 = new Teh12();
        Teh13 teh13 = new Teh13();
        Pankki bank = new Pankki();
        Teh16 teh16 = new Teh16();
        Teh17 teh17 = new Teh17();
        

        //11
        // System.out.println(teh11.big());

        //12
        // System.out.println(teh12.randomName());

        //13
        // System.out.println(teh13.haku(new File("./tehtavanippu2")));

        //14
        // Pankkitili pankkitili = new Pankkitili("John Doe", "12345", 1000);
        // bank.addAccount(pankkitili);
        // Pankkitili pankkitili2 = new Pankkitili("Moe Lester", "321", 1000);
        // bank.addAccount(pankkitili2);


        // System.out.println("Number of accounts " + bank.accounts.size());
        // bank.accountCheck("12345");
        // bank.accountCheck("321");

        // bank.accountDelete("321");

        // pankkitili.addMoney(100);
        // bank.accountCheck("12345");

        // pankkitili.withdraw(99);
        // bank.accountCheck("12345");

        // pankkitili.checkBalance();

        // System.out.println("Number of accounts " + bank.accounts.size());

        //15
        // Teh15 instance1 = Teh15.getInstance();
        // Teh15 instance2 = Teh15.getInstance();

        // Teh15.setTrack("The Last Stand - Sabaton");

        // System.out.println("Now playing " + Teh15.playTrack());

        // if (instance1 == instance2) {
        //     System.out.println("Both instances are the same");
        // } else {
        //     System.out.println("Instances are different");
        // }

        //16
        // int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11};
        // System.out.println(teh16.missingNum(arr1));

        //17
        // System.out.println(teh17.wordreverser("Hello"));

        //18
        
    }
}