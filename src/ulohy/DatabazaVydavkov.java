package ulohy;

public class DatabazaVydavkov {
    public static void main(String[] args) {
        Vydavok vydavok1 = new Vydavok("kava", 1.80, true);
        System.out.println(vydavok1.getNazov());
        System.out.println(vydavok1.getVyskaKonkretnehoVydavku());
        System.out.println(vydavok1.isJeOsobny());

        Vydavok vydavok2 = new Vydavok(null, 0, false);
        System.out.println(vydavok2.getNazov());
        System.out.println(vydavok2.getVyskaKonkretnehoVydavku());
        System.out.println(vydavok2.isJeOsobny());

    }
}
