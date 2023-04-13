/*13.04.2023
        Úloha na opakovanie: Vypíš maticu s údajmi od 1 do 25
        Vytvorte (vypíšte) maticu údajov do konzoly, ktoré budú vyzerať nasledovne:
        1 2 3 4 5
        6 7 8 9 10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25

        Bonusová úloha: Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok tej predchádzajúcej hodnoty (začneme 1), takže bude to vyzerať nasledujúco:

 */


package ulohy;

public class MaticaUdajov {
    public static void main(String[] args) {
        // Vypoctove operatory porovnania su nasledovne:
        // <
        // >
        // =
        // >=
        // <=


        for (int i = 1; i <= 25; i++) {
            if (i == 6 || i == 11 || i == 16 || i == 21) {
                System.out.println(); // novz riadok pri 7 aj pri 8
            }
            System.out.print(i + " ");
        }
        System.out.println();

// Riesenie cislo 2:
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}



