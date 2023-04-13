package opakovanie;
//Vytvorte program, ktorý načíta z poľa celé ciselne hodnoty a vypise, ci dana hodnota je parna alebo neparna

public class Pole {
    public static void main(String[] args) {
        int[] cisla = {0, 1, 8, 10, 12, 99}; // Hranate zatvorky urcuju, ze sa jedna o "staticke" pole

        // Prechádzame jednotlivymi polozkami (teda cislami) pola...
        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]);  //...a vypiseme ich do konzoly

            // TODO Nastavit logiku, ktora vypise, ci je cislo plne alebo nie
            // Riesenie: Ak je cilso delitelne 2-mi tak je parne a ak nie, tak je neparne. Mozme pouzit IF,ELSE
            // Mozeme pouzit IF, ELSE, modulo


            if (cisla[i] % 2 == 0) {
                System.out.println("je párne");

            } else {
                System.out.println("je neparne");
            }


        }

    }
}
