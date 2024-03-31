package com.example.Teh14;
import java.util.ArrayList;

public class Pankki {
    public ArrayList<Pankkitili> accounts = new ArrayList<>();

    public void addAccount(Pankkitili pankkitili){
        accounts.add(pankkitili);
    }
}
