package com.example.Teh14;
import java.util.ArrayList;
import java.util.Iterator;

public class Pankki {
    public ArrayList<Pankkitili> accounts = new ArrayList<>();

    public void addAccount(Pankkitili pankkitili){
        accounts.add(pankkitili);
    }

    public void accountCheck(String adress){
        for (Pankkitili tili : accounts){
            if (tili.accountAdress == adress){
                System.out.println(tili.accountData());
            }
        }
    }

    public void accountDelete(String delAdress){
        Iterator<Pankkitili> iterator = accounts.iterator();
        while(iterator.hasNext()){
            Pankkitili deltili = iterator.next();
            if (deltili.accountAdress.equals(delAdress)){
                iterator.remove();
            }
        }
    }    
}
