package com.example;
import java.io.File;
import com.example.Teh14.*;

public class Main {

    public static void main(String[] args) {
        Teh11 teh11 = new Teh11();
        Teh12 teh12 = new Teh12();
        Teh13 teh13 = new Teh13();
        Pankki bank = new Pankki();

        //11
        // System.out.println(teh11.big());

        //12
        // System.out.println(teh12.randomName());

        //13
        // System.out.println(teh13.haku(new File("./tehtavanippu2")));

        //14
        Pankkitili pankkitili = new Pankkitili("John Doe", "12345", 1000);
        bank.addAccount(pankkitili);
        Pankkitili pankkitili2 = new Pankkitili("Moe Lester", "321", 1000);
        bank.addAccount(pankkitili2);


        System.out.println("Number of accounts " + bank.accounts.size());
        bank.accountCheck("12345");
        bank.accountCheck("321");

        bank.accountDelete("321");

        pankkitili.addMoney(100);
        bank.accountCheck("12345");

        pankkitili.withdraw(99);
        bank.accountCheck("12345");

        System.out.println("Number of accounts " + bank.accounts.size());
    }
}