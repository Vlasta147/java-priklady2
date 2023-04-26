package ulohy;

import java.util.ArrayList;
import java.util.Scanner;

/* Zadanie
Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt,
ktoré budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.

        Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
        Poznámka: Skúsme “ošetriť” zadanie textových hodnôt tak, aby program nespadol.
        Bonusová úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.*/

// TODO Zvazit pomenovanie triedy, aby viac reprezentovala ciel
public class DynamickePoleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> dynamickePoleCisiel = new ArrayList<Integer>(); //Vytvorili sme prazdne dynamicke pole
        int cislo = 0;
        while (cislo >= 0) {
            Scanner scn = new Scanner(System.in); // Inicializacia konzoly na vstup udajov z klavesnice
            System.out.println("Zadaj akékoľvek celé číslo");

            try {
                cislo = scn.nextInt(); // Caka na konkretny vstup od pouzivatela v podobe cila
            } catch (Exception e)  {
                System.out.println("Zadal si nespravny format cisla");

            }

            dynamickePoleCisiel.add(cislo); // Vlozili sme do dynamickeho pola hodnotu

            //Metoda get(index) vrati hodnotu z pola, ked pouzijeme get(0) tak nam vrati prvy prvok
            System.out.println("Prvá hodnota v dynamickom poli Arraylist je: " + dynamickePoleCisiel.get(0));
        }

        // Vypis celkoveho suctu
        int sum = 0;
        // v cykle pouzijeme -1, pretoze v cykle nechceme pouzit zapornu hodnotu, co je posledny prvok pola
        for (int i = 0; i < dynamickePoleCisiel.size()-1; i++) {
            sum = sum + dynamickePoleCisiel.get(i);
        }
        System.out.println("Celkovy sučet cisiel je: " + sum);
        /*for (Integer hodnota:dynamickePoleCisiel) {
            sum = sum + hodnota;
            }*/


    }


    // Na konci vsetky hodnoty okrem poslednej (pretoze ta je zaporna) je potrebne scitat


}

