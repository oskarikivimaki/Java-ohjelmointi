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
        System.out.println(bank.accounts);
    }
}