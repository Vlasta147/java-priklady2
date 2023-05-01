package opakovanie.service;
// Trieda konciaca v nazve slovom Service riesi aplikacnu logiku konkretnej triedy, v nasom pripade modelu triedy Kniha


import opakovanie.model.Kniha;

import java.util.ArrayList;
import java.util.Scanner;

public class KnihaService {
    private Scanner sc = null; // Tu ma skener platnost v celej triede

    // Prazdny konstruktor
    public KnihaService() {
        System.out.println("Konštruktor");
        // V konstruktore  zadefinujeme, resp. naplnim  premenne, resp. objekty, cize nieco inicializujem
        // SINGLETON
        if (sc == null) {
            sc = new Scanner(System.in);
        }
    }

    public void zobrazMenu() {
        System.out.println("        Menu s možnosťami\n" +
                "        -----------------\n" +
                "        1. Zadaj novú knihu\n" +
                "        2. Zobraz všetky knihy\n" +
                "        3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                "        4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                "        5. Zobraz počet všetkých kníh\n" +
                "        6. Vyhľadaj knihu podľa názvu\n" +
                "        9. Vymaž všetky knihy\n" +
                "        Koniec = skončí zadávanie novej knihy");

    }

    public void pridajKnihu(ArrayList <Kniha> vsetkyKnihy) {
        //Scanner sc = new Scanner(System.in); tu by mal skener platnost iba v tejto metode
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
    }

    public void zobrazVsetkyKnihy(ArrayList<Kniha> vsetkyKnihy) {
        System.out.println("Vybral som 2");

        //Testujeme ci je kniznica, teda vsetky, cize ArrazList prazdny a to cez metodu is Empty()
        //if (vsetkyKnihy.isEmpty()) System.out.println("Knižnica je prázdna!");
        if (vsetkyKnihy == null) System.out.println("Knižnica je prázdna!");

         for (Kniha konkretnaKniha : vsetkyKnihy) {
            System.out.println("Názov knihy:" + konkretnaKniha.getNazov());
            System.out.println("Autor:" + konkretnaKniha.getAutor());
            System.out.println("Rok vydania " + konkretnaKniha.getRokVydania());
        }
    }

    public void zobrazKnihuPodlaIndexu (ArrayList<Kniha> vsetkyKnihy){
        //Scanner sc = new Scanner(System.in);
        try {
            //Funkcionalita tohto menu je nasledovna: Zobraz konkretnu knihu podľa indexu\n"
            System.out.println("Zadaj index knihy, ktorú chceš zobraziť (pozn: od 1 po N)");
            int indexKnihy = sc.nextInt(); //Od pouzivatela vyzadujeme index knihy,cislo, tj. sc.nextInt()

            Kniha najdenaKniha = vsetkyKnihy.get(indexKnihy - 1); // Tymto zapisom sme ziskali knhu podla jeho indexu
            // -1 preto, lebo zacina sa od nuly 0, takze vlastne prvy prvok je vlastne nulty
            System.out.println(najdenaKniha); // Tym, ze v triede Kniha mame metodu toString, tak si ju mozeme vypisat takto priamo
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Zadal si neexistujúce číslo indexu");
        } catch (Exception e) {
            System.out.println("Neznáma chyba!");
        }
    }


}
