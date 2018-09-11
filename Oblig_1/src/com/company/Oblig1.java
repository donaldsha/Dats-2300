package com.company;


//StudentNavn: Donald Shahini
//StudentNummer: s331041

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    //tom konstruktoer
    public Oblig1(){ }


    //Oppgave 1
    //metoden skal finne og returnere den stoerste verdien i en array
    //for aa finne verdien jeg skal bruke boblesortering
    //det blir
    public static int maks(int[] a){
        int lengde = a.length;

        if (lengde == 0){//sjekker om lengde = 0
            throw new NoSuchElementException("Arrayen er tom!");
        }

        int maks = 0;
        for (int i = lengde; i>1; i--){
            for (int j = 1; j<i; j++){
                if (a[j-1] > a[j]){ //sjekker om a[0] > a[1] osv
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
            maks = a[lengde-1];
        }
        //System.out.println("maks er: " + maks);
        return maks;
    }


    //ombyttinger skal returnere antall ombyttinger
    // Naar blir det flest ombyttinger? --> Naar arrayen er sortert baklengst
    // Naar blir det faerrest? --> Naar arrayen er ferdig sortert
    // Hvor mange blir det i gjennomsnitt?
    public static int ombyttinger(int[] a){
        int lengde = a.length;
        int ombytting = 0;
        for (int i = lengde; i>1; i--){
            for (int j = 1; j<i; j++){
                if (a[j-1] > a[j]){
                    int temp = a[j];//TODO sjekk igjen
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                ombytting++;
            }
        }
        //System.out.println("Array " + Arrays.toString(a));
        return ombytting;
    }

    //oppgave 2
    //metoden returner antall forkjellige verdier i arrayen
    public static int antallUlikeSortert(int[] a){
        int ulike = 0;

        for (int i = 1; i<a.length-1; i++) {
            if (a[i-1] > a[i]) {//sjekk om arrayen er sortert stigende
                throw new IllegalStateException("Arrayen er ikke sortert stigende");
            }
        }
        if (a.length > 0){
            for (int i = 0; i<a.length-1; i++){
                if (a[i] != a[i+1]){
                    ulike++;
                }
            }
            return ulike;
        }else {
            return 0;
        }
    }

    //Oppgave 3
    //returnerer antall ulike tall i et usortert array
    public static int antallUlikeUsortert(int[] a){

        if (a.length <= 0){
            return 0;
        }

        int ulike = 1;
            for (int i = 0; i<a.length; i++){
                for (int j = 0; j<i; j++){
                    if (a[i] == a[j]){
                        ulike++;
                        break;
                    }
                }
            }
        return ulike;
    }

    //oppgave 4
    //deler en array 1 to sorterte tabeller, oddetallene til venstre og partallene hoeyre
    public static void delsortering(int[] a){//tre sortering kan brukes
        int venstre = a.length-1;
        int hoeyre = 0;

        while (hoeyre < venstre){
            //inkrement hoeyre når vi ser 0 til hoeyre
            while (a[hoeyre]%2 == 1 && hoeyre < venstre ){
                hoeyre++;
            }
            //dekrement venstre når vi ser 1 til venstre
            while (a[venstre]%2 == 0 && hoeyre < venstre){
                venstre--;
            }
            if (hoeyre < venstre){
                int temp = a[hoeyre];
                a[hoeyre]= a[venstre];
                a[venstre]= temp;
                hoeyre++;
                venstre--;
            }
        }
    }

    //oppgave 5
    public static void rotasjon(char[] a){
        int lengde = a.length-1;
        int value = 1;
        for (int i = 0; i<value; i++){
            for (int j = lengde; j>0; j--){
                char temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }

    //Oppgave 6
    public static void rotasjon(char[] a, int k){
        int lengde = a.length-1;

        if (k>0) {
            for (int i = 0; i < k; i++) {
                for (int j = lengde; j > 0; j--) {
                    char temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        } else if(k<0){
            for (int i = 0; i > k; i--) {
                for (int j = 0; j < lengde; j++) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }else{//Naar k = 0 skal arrayen skrives ut som den er
            System.out.println(Arrays.toString(a));
        }
    }

    //oppgave 7
    public static String flett(String s, String t){
        String array = "Array";

        return array;
    }
}
