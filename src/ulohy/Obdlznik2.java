package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).
Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.
Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.
*/
public class Obdlznik2 {

    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }

    public static double vypocitajObsah(double stranaA, double stranaB) {
        return (stranaA * stranaB);
    }

    public static void main(String[] args) {
        //double a = 2; // Strana a
        //double b = 3; // Strana b
        Scanner scn = new Scanner(System.in);
        double a = 0;
        double b = 0;

        try {
            System.out.println("Zadaj stranu a");
            a = scn.nextDouble();

            System.out.println("Zadaj stranu b");
            b = scn.nextDouble();
        } catch (InputMismatchException e) {
            //Tu dopisem vlastny kod, ktory naraba s vznimkou, alebo chybou
            System.out.println("Zadali ste nespravny format hodnoty.");
        }

        System.out.println("Obvod obdlznika je: " + vypocitajObvod(a, b));
        System.out.println("Obsah obdlznika je: " + vypocitajObsah(a, b));

        //TODO Na osetrenie chyb resp. zhavarovania programu pouzivame prikazy try a catch


    }
}





