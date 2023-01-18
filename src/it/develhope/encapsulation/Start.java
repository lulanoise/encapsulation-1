package it.develhope.encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        House h = new House();
        h.setFloorsNumber(3);
        h.setAddress("Paiolo Magico");
        h.setResidentsNames(new String[]{"Harry","Hermione","Ginny","Ron"});
        // h.setResidentsNames("Harry,Hermione,Ginny,Ron") (var args); //String array

        System.out.println(h);
       // this is needed to consume the new line left-over after nextInt()

    }

}
