/*
 Úloha č.1: Vytvorte hru Fizz buzz

 Fizz buzz je skupinová slovná hra pre deti, ktorej účelom je naučiť ich delenie čísel. Hráči postupne vymenúvajú
 čísla, pričom nahrádzajú každé číslo deliteľné tromi slovom "fizz" a každé číslo deliteľné piatimi slovom "buzz".

 Hra
 Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč povie číslo o jedno vyššie
 od predošlého. Akékoľvek číslo deliteľné tromi musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné
 piatimi slovom buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý zaváha alebo urobí chybu
 je vylúčený z hry.

 Typická hra fizz buzz môže začínať takto:

 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23,
 Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …
 Hint1: % cize modulo je vypoctovz operator, ktory sa pouziva na vypocet zvysku po deleni
 Hint2: || reprezentuju OR alebo
 Hint3: && to znamena, že plati jedna a zaroven druha podmienka
 */


import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // TODO: chceme urobiť konzolovy vstup, v ktorom by pouzivatel zadal cislo v tvare napr. 3 8 12 45 98
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj cisla napr. v tvare 3 8 12 45 98");
        String vstupneHodnoty = scn.nextLine();  // Priamy pouzivatelsky vstup, konzola ocakava zadania hodnot

        System.out.println("Zadane vstupne hodnoty sú: " + vstupneHodnoty);
        // TODO: ako rozdelit jednotlive hodnoty zo vstpneHodnoty, abz algoritmus vedel ich jednotlivo vyhodnotiť

        String[] poleHodnot = vstupneHodnoty.split(" "); // vytvorili sme pole TEXTOVYCH hodnot pouzitim prikazu
        // split - rozdelit cez medzeru preto je medzera medzi "" V ()
        //System.out.println("Pole individualnych zadanych hodnot je: " +poleHodnot);
        for (int i = 0; i < poleHodnot.length; i++) { // cyklus s pevnym poctom opakovaní
            String individualnaHodnota = poleHodnot[i];
            int hodnota = Integer.parseInt(individualnaHodnota); //Prekonvertovali sme cislo ako text na realne
            // cele cislo, teda int

            // TODO: zjednodusit podmienku nizsie
            // if ((hodnota % 3 == 0) && (hodnota % 5 == 0)) {
            if (hodnota % 15 == 0) {
                System.out.print("Fizz Buzz");
            } else if (hodnota % 3 == 0) {
                System.out.print("Fizz");
            } else if (hodnota % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(hodnota);
            }
            System.out.print(" ");
        }
    }
}
//System.out.println(poleHodnot[i]); //vypiseme individualne hodnoty


// int hodnota = 17;

// TODO: zjednodusit podmienku nizsie
// if ((hodnota % 3 == 0) && (hodnota % 5 == 0)) {

