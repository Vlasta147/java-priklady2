package ulohy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).

        Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.
        Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.
*/
public class Obdlznik {
    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }
    public static double vypocitajObsah(double stranaA, double stranaB) {
        return (stranaA * stranaB);
    }
    public static void main(String[] args) {
        double a = 2; // Strana a
        double b = 3; // Strana b
        System.out.println("Obvod obdlznika je: " + vypocitajObvod(a, b));
        System.out.println("Obsah obdlznika je: " + vypocitajObsah (a, b));
    }

    //Vlozime jUnit test
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObvod() {
        // Metoda assertEquals vyzaduje zadanie 2 argumentov, prip. viac.
        // Prvy je spravna hodnota, ktorú ocakavame ako ludia. Druhy argument je volanie metody, ktoru testujeme.
        // Ta tiez vráti hodnotu,ktoru vlastne porovnava s tou skutocnou
        assertEquals(10.0, vypocitajObvod(2,3));
        assertEquals(6.0, vypocitajObvod(1,2));
    }
    @Test
    void otestujVypocitajObsah() {
        assertEquals(6.0, vypocitajObsah(2,3));
        assertEquals(2.0, vypocitajObsah(1,2));
    }
}
