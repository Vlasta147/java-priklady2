package ulohy;

/*Úloha č.1
        Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ musí uhádnuť číslo.
        Ak uhádne menšie, tak mu Java vypíše Neuhádol si, moje číslo je väčšie, analogicky Neuhádol si,
        moje číslo je menšie a pri úspešnom uhádnutí BINGO! Uhádol si!*/

import java.util.Random;
import java.util.Scanner;

public class HraHadajCislo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random r = new Random();

        int MinCislo = 1;
        int MaxCislo = 10;
        int nahodneCisloGenerovaneJavou = r.nextInt(MaxCislo - MinCislo + 1) + MinCislo;

        System.out.println("CHEAT: Vygeneroval som taketo nahodne cislo " + nahodneCisloGenerovaneJavou);
        int zadaneCisloPouzivatelom = 0;


        //Zaciatok opakovania
        while (nahodneCisloGenerovaneJavou != zadaneCisloPouzivatelom) {
            System.out.println("Zadaj číslo od 1 do 10");
            zadaneCisloPouzivatelom = scn.nextInt();
            if (nahodneCisloGenerovaneJavou == zadaneCisloPouzivatelom) {
                System.out.println("Ano, uhadol si");
            } else if (nahodneCisloGenerovaneJavou <= zadaneCisloPouzivatelom) {
                System.out.println("Nie, neuhadol si, moje vygenerovane cislo je mensie");
            } else {
                System.out.println("Nie, neuhadol si, moje vygenerovane cislo je vacsie");
            }
        }
    }
}
