package opakovanie.service;
// Trieda konciaca v nazve slovom Service riesi aplikacnu logiku konkretnej triedy, v nasom pripade modelu triedy Kniha


public class KnihaService {

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
}
