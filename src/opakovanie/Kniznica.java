package opakovanie;
/*Vytvorte knižnicu (Kniznica), kde bude môcť používateľ zadať knihy (názov, autora, rok vydania) cez konzolu kým nezadá slovo quit. Tie na konci vypíšeme. Opakovanie na ArrayList.

        Menu s možnosťami
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Vymaž konkrétnu knihu (podľa indexu)
        Zobraz počet všetkých kníh
        9. Vymaž všetky knihy
        Koniec = skončí zadávanie novej knihy
*/

import opakovanie.model.Kniha;

import java.util.ArrayList;
import java.util.Scanner;

public class Kniznica {
    public static void main(String[] args) {
        //musime vytvorit model

        ArrayList<Kniha> vsetkyKnihy = new ArrayList<Kniha>(); //Vytvorime dynamické pole, teda Arraylist, ktorý je novy
//vsetkyKnihy.get(0); // Vrati prvu knihu
       // vsetkyKnihy.remove((0)); // Vymaze vsetky knihy
        while (true) {
            System.out.println("        Menu s možnosťami\n" +
                    "        -----------------\n" +
                    "        1. Zadaj novú knihu\n" +
                    "        2. Zobraz všetky knihy\n" +
                    "        3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                    "        4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                    "        5. Zobraz počet všetkých kníh\n" +
                    "        9. Vymaž všetky knihy\n" +
                    "        Koniec = skončí zadávanie novej knihy");


            Scanner sc = new Scanner(System.in);
            String menuPolozka = sc.nextLine();
            // TODO Ako to spravit, aby sme mohli zadat cislo aj text
            // TODO Vytvorte kod, ktory bude reagovat zatial iba "slovne", teda vypise do konzoly, co ste vybrali. Hint: Pouzijeme funkciu IF, prip. SWITCH, CASE

            if (menuPolozka.equals("1")) {
                Kniha novaKniha = new Kniha(); // Vytvorime objekt knihy, cize prazdnu knihu

                System.out.println("Vybral som 1");
                System.out.println("Zadaj názov knihy");
//novaKniha.setNazov(sc.nextLine()); iny zapis pre nizsie veci tykajuce sa nazvu
                String nazovKnihy = sc.nextLine(); // Pozadujeme od pouzivatela nazov knihy

                System.out.println("Zadaj meno autora");
                String autor = sc.nextLine();

                System.out.println("Zadaj rok");
                int rokVydania = sc.nextInt();

                novaKniha.setNazov(nazovKnihy); // Ulozime nazov knihy cez setter, cize setNazov
                novaKniha.setAutor(autor);
                novaKniha.setRokVydania(rokVydania);

                // teda je prazdny
                vsetkyKnihy.add(novaKniha);

            } else if (menuPolozka.equals("2")) {
                System.out.println("Vybral som 2");

                //TODO Vypiste vsetky knihy
                // Hint: foreach
                for(Kniha konkretnaKniha:vsetkyKnihy) {
                    System.out.println("Názov knihy:" + konkretnaKniha.getNazov());
                    System.out.println("Autor:" + konkretnaKniha.getAutor());
                    System.out.println("Rok vydania " + konkretnaKniha.getRokVydania());
                }

            } else if (menuPolozka.equalsIgnoreCase("koniec")) {
                break;
            } else {
                System.out.println("Nevybral som ani jednu správnu odpoveď");
            }
        }
/*
        System.out.println("\nTeraz vypisujem odpoveď cez SWITCH, CASE");

        switch (menuPolozka) {
            case "1":
                System.out.println("Vybral som 1");
                //break;
            case "2":
                System.out.println("Vybral som 2");
                //break;
            default:
                System.out.println("Nevybral som ani jednu spravnu odpoveď");
// Ak zakomentujem break, nebude prerusenie, vypisuje vsetko
        }

*/
    }
}

