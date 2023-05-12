package sk.tmconsulting.rozhrania;

public class EvidenciaKlientovMain {
    public static void main(String[] args) {
        Klient klient1 = new Klient();
        klient1.setMeno("Vlasta");
        klient1.setPriezvisko("Kunecová");

        KlientService klientService = new KlientService();
        klientService.zobrazOsobneUdaje(klient1);
    }
}
