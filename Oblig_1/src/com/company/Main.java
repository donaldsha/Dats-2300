package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1,2,4,3,6,4,1,8,12,13, 16, 11};
        //test for null elementer
        int[] b = {1,2,3,4,5};
        Oblig1 oblig1 = new Oblig1();

        int maksVerdi = oblig1.maks(a);
        System.out.println("Maks verdi er: " + maksVerdi);

        int ombytt = oblig1.ombyttinger(a);
        System.out.println("ombyttinger: " + ombytt);

        System.out.println("Antall ulike sorrtert: " + oblig1.antallUlikeSortert(b));
        System.out.println("Antall ulike usortert: " + oblig1.antallUlikeUsortert(a));

        //oppgave 4
        int[] array = {6,10,9,4,1,3,8,5,2,7};
        oblig1.delsortering(array);
        System.out.println(Arrays.toString(array));
    }
}