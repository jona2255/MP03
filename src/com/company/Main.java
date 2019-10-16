package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<Lapiz> lista = new ArrayList<Lapiz>();

        for (int i = 0; i < 10; i++) {

            Lapiz lapiz = new Lapiz();
            lista.add(lapiz);
        }


        System.out.println(lista);

        Collections.sort(lista);



        Set<Lapiz> hashLapiz = new HashSet<Lapiz>();


        System.out.println(lista);

        Collections.sort(lista, new Comparator<Lapiz>() {
            @Override
            public int compare(Lapiz lapiz, Lapiz t1) {
                if (lapiz.getGrosor() > t1.getGrosor()) return 1;
                else if (lapiz.getGrosor() < t1.getGrosor()) return-1;
                return 0;
            }
        });

        System.out.println(lista);

    }
}
