package com.example;
import java.util.Random;

public class Teh12 {
    public String randomName(){
        Random rnd = new Random();
        String[] etunimet = {"Juhani", "Olavi", "Tapani", "Aino", "Eeva", "Liisa", "Kaisa", "Matti", "Mikko", "Ilmari", "Risto", "Antti", "Oskari", "Teemu", "Sakari", "Tuomas", "Ville", "Jarmo", "Heikki", "Pekka"};
        String[] sukunimet = {"Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Mäkelä", "Hämäläinen", "Laine", "Heikkinen", "Koskinen", "Järvinen", "Lehtonen", "Lehtinen", "Saarinen", "Salminen", "Rantanen", "Jokinen", "Peltonen", "Tuominen", "Laaksonen", "Heinonen"};
        int rInt = rnd.nextInt(20);
        int gInt = rnd.nextInt(20);
        String rName = etunimet[rInt] + " " + sukunimet[gInt];
        return rName;
    }
}
