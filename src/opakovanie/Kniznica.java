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
import opakovanie.service.KnihaService;

import java.util.ArrayList;
import java.util.Scanner;

public class Kniznica {
    public static void main(String[] args) {
        //musime vytvorit model

        ArrayList<Kniha> vsetkyKnihy = new ArrayList<Kniha>(); //Vytvorime dynamické pole, teda Arraylist, ktorý je novy
//vsetkyKnihy.get(0); // Vrati prvu knihu
        // vsetkyKnihy.remove((0)); // Vymaze vsetky knihy
        while (true) {
            // TODO Zobraz menu z KnihaService

            // Ak chceme volat metody z nejakej inej triedy, tak musime najprv vytvorit objekt, ktory vlozime do premennej,
            // cize v tomto pripade sme vytvorili objekt KnihaService (cize napisali sme new KnihaService) a vlozili ho do
            // premennej knihaService
            // Potom mozeme volat metody cez nazov premennej a pouzitim bodky (nasledne zobrazi vsetky dostupne metody
            // - aj tie nase naprogramovane.

            KnihaService knihaService = new KnihaService();
            knihaService.zobrazMenu();


            Scanner sc = new Scanner(System.in);
            String menuPolozka = sc.nextLine();
            // TODO Ako to spravit, aby sme mohli zadat cislo aj text
            // TODO Vytvorte kod, ktory bude reagovat zatial iba "slovne", teda vypise do konzoly, co ste vybrali. Hint: Pouzijeme funkciu IF, prip. SWITCH, CASE


            if (menuPolozka.equals("1")) {
                knihaService.pridajKnihu(vsetkyKnihy);


            } else if (menuPolozka.equals("2")) {
                knihaService.zobrazVsetkyKnihy(vsetkyKnihy);


            } else if (menuPolozka.equals("3")) {
               knihaService.zobrazKnihuPodlaIndexu(vsetkyKnihy);


            } else if (menuPolozka.equals("4")) {
                // 4. Vymaž konkretnu knihu podla indexu/n{

                try {
                    //FUnkcionalita tohto menu je nasledujuca
                    System.out.println("Zadaj index knihy, ktorú chceš vymazať (pozn: od 1 po N)");
                    int indexKnihy = sc.nextInt(); //Od pouzivatela vyzadujeme index knihy,cislo, tj. sc.nextInt()
                    Kniha najdenaKniha = vsetkyKnihy.remove(indexKnihy - 1); // Tymto zapisom sme ziskali knhu podla jeho indexu
                    // -1 preto, lebo zacina sa od nuly 0, takze vlastne prvy prvok je vlastne nulty
                    System.out.println("ZMAZALA sa práve táto kniha:");
                    System.out.println(najdenaKniha); // Tym, ze v triede Kniha mame metodu toString, tak si ju mozeme vypisat takto priamo
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Zadal si neexistujúce číslo indexu");
                } catch (Exception e) {
                    System.out.println("Neznáma chyba!");
                }


            } else if (menuPolozka.equals("5")) {
                System.out.println("Celkový počet kníh je: " + vsetkyKnihy.size());


            } else if (menuPolozka.equals("6")) {
                System.out.println("Zadaj názov hľadanej knihy");
                String hladanyNazovKnihy = sc.nextLine();

                //Pri hladani nazvu konkretnej knihy budeme prechadyat vsetkymi knihami, resp. ich nazvami a cez prikaz - metodu- contains
                boolean jeNajdena = false;
                for (Kniha knihaVZozname : vsetkyKnihy) {
                    if (knihaVZozname.getNazov().contains(hladanyNazovKnihy)) {
                        System.out.println("Kniha zodpovedajúca hľadaniu: " + knihaVZozname);
                    } else
                        System.out.println("Nebola nájdená žiadna kniha podľa názvu."); // Ked mame 10 knih, vypise to 10x ak nenajde knihu

                }

                // TODO Ako to urobit, aby to napisalo iba 1x??
                //IDEM CEZ boolean
                if (jeNajdena == false) System.out.println("Nebola nájdená žiadna kniha podľa názvu.");
                // jeNajdena == false, inač zapisane !jeNajdena

            } else if (menuPolozka.equals("9")) {
                vsetkyKnihy.removeAll(vsetkyKnihy);
                System.out.println("Knihy sú odstránené. Knižnica je prázdna!");

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
