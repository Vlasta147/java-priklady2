//03.04.2023
//       Úloha č.1: Priradenie číselného hodnotia k textovému

//        Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý, dostatočný,
//        nedostatočný vypíše zodpovedajúcu známku čiže 1, 2, 3, 4, 5.
//        Hint: Porovnanie textov sa cez IF robí ináč ako porovnanie s číslom. Nemôžeme použiť ==, je potrebné použiť .
//        equals
//        Hint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.

//        Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniec
//        Bonusová úloha č. 2: Skúsme “ošetriť” používateľský vstup tak, aby reagoval na vstupný text bez ohľadu
//        na diakritiku.
//
//        Popis programu.
//        Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne
//        (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď
//        v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.
//        Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program
//        zadaním slova: koniec
//        Program po zadaní koniec ukončí svoju činnosť a nevypíše nič.

import java.text.Normalizer;
import java.util.Scanner;

public class PriradenieCiselnehoHodnoteniaKTextovemu {
    public static String odstranDiakritiku(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    public static void main(String[] args) {

        String SlovnaZnamka = ""; //SlovnaZnamka nazaciatku ziadne slovne hodnoetenie, text je prazdny, cize ""


        //START, cyklus zacne
        //while (!SlovnaZnamka.equals("koniec")) { // ak mam while a ! nepotrebujem riadok else if (SlovnaZnamka.equals("koniec")) {
            // break na konci
        while (true) { //Cyklus pôjde do nekonecna, pretoze while obsahuje v sebe true
            // for (;;) { //ekvivalent pre while (true)
            System.out.println("\nZadaj slovnú známku (výborný, chválitebný, dobrý, dostatočný, nedostatočný)");
            System.out.println("Poznámka: PO zadani príkazu ´koniec´ program ukončí svoju činnosť");

            Scanner scn = new Scanner(System.in); // inicializujeme konzolu pre vstup hodnoty od pouzivatela
            SlovnaZnamka = scn.nextLine(); // scn.nextLine() v konzole zobrazí kurzor a poziada pouzivatela
            // o vstupnu text. hodnotu

            // Ak chceme vyhodnotiť 2 a viac podmienok, ktoré platia jedna alebo druha, tak pouzijeme || (tzv. pipe AltGr+W)
            // Pipe je ekvivalentom príkazu OR z iných programovacích jazykov
            // pre príkaz AND existuje javovsky príkaz &&
            // TODO ako vyriesit diakritiku
            // Riesenie: Zo slovnej známky odstránime diakritiku a prerobíme funkčnost IF, aby porovnavala hodnoty bez diakritiky

            SlovnaZnamka = odstranDiakritiku(SlovnaZnamka);
            //System.out.println("Slovná známka už bez diakritiky vyzera takto: " + SlovnaZnamka);
            SlovnaZnamka = SlovnaZnamka.toLowerCase(); // Prikaz toLoverCase prekonvertuje text na male pismena
            //System.out.println("Slovná známka po zmene na malé písmená vyzerá takto: " + SlovnaZnamka);

            //SlovnaZnamka = SlovnaZnamka.toLowerCase().toUpperCase();
            //System.out.println("Slovná známka po experimente s 2 príkazmi vyzerá takto: " + SlovnaZnamka);

            if (SlovnaZnamka.equals("vyborny")) {
                System.out.println(1);
            } else if (SlovnaZnamka.equals("chvalitebny")) {
                System.out.println(2);
            } else if (SlovnaZnamka.equals("dobry")) {
                System.out.println(3);
            } else if (SlovnaZnamka.equals("dostatocny")) {
                System.out.println(4);
            } else if (SlovnaZnamka.equals("nedostatocny")) {
                System.out.println(5);
            } else if (SlovnaZnamka.equals("koniec")) {
                break; //ukonci cyklus while
            } else {
                System.out.println("Pre zadanú známku neexistuje žiadna číselná hodnota!");
            }
        }


    }
}
// KONIEC cyklus sa koncí




