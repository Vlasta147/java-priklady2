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

    public static void main(String[] args) {
        double a = 2; // Strana a
        double b = 3; // Strana b
        System.out.println("Obvod obdlzika je: " + vypocitajObvod(a, b));
    }

    //Vlozime jUnit test
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObvod() {
        assertEquals(10.0, vypocitajObvod(2,3));
    }

}
