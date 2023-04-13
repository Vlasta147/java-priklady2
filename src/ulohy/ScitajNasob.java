package ulohy;
/*Úloha na opakovanie: Premenné, cykly a jednoduchý algoritmus na súčet
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať,
        čiže výsledkom bude celkový súčet hodnôt.

        Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať
        výsledok po sčítaní.
        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu nasob(), ktorá bude násobiť dané čísla*/

public class ScitajNasob {
    public static void main(String[] args) {
        int[] cisla = {1, 8, 9, 10, 12};
        int sum = 0;
        int nasobenie = 1;

        //funkcia scitania hodnot pola
        //cyklus oznacovany ako foreach prechadza kazdym prvkom pola
        for (int cislo : cisla) {
            sum = sum + cislo;
            //sum += cislo; - je to iny zapis pre riadok vyssie,ina logika scitania
            //System.out.println(cislo); //vypise obsah kazdeho prvku pola
        }
        System.out.println("Vysledkom scitania je:" + sum);

        //funkcia nasobenia hodnot pola

        for (int cislo : cisla) {
            nasobenie = nasobenie * cislo;
            //nasobenie *= cislo;
        }
        System.out.println("vysledkom nasobenia je:" + nasobenie);
    }
}
