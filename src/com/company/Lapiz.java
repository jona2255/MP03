package com.company;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Lapiz implements Comparable<Lapiz>{

    private int color;
    private int grosor;

    public int getColor() {
        return color;
    }

    public int getGrosor() {
        return grosor;
    }

    public Lapiz() {

        color = (int) (Math.random() * 10) + 1;
        grosor = (int) (Math.random() * 10) + 1;
    }

    @Override
    public String toString() {
        return "Lapiz{" +
                "color=" + color +
                ", grosor=" + grosor +
                '}';
    }


    @Override
    public int compareTo(Lapiz lapiz) {
        if (this.color>lapiz.color)return 1;
        else if (this.color<lapiz.color) return-1;
        return 0;
    }

}
