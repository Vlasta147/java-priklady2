public class ZakladneMatematickeOperacieCezMetody {

    public static double scitaj(double cis1, double cis2) {
        return cis1 + cis2;
    }
    //TODO Pridajte dalsie metody, ktore budu pracovat s matematickymi operaciami
    public static double odcitaj(double cis1, double cis2) {
        return cis1 - cis2;
    }
    public static double vynasob(double cis1, double cis2) {
        return cis1 * cis2;
    }
    public static double vydel(double cis1, double cis2) {
        return cis1 / cis2;
    }
    public static double zvysokPoDeleni(double cis1, double cis2) {
        return cis1 % cis2;
    }

    public static void main(String[] args) {
        double cislo1 = 5.0;
        double cislo2 = 2.5;

        System.out.printf("Vysledkom scitania hodnôt " + cislo1 + " a " + cislo2 + " je " + scitaj(cislo1, cislo2));
        System.out.printf("\nVysledkom odcitania hodnôt " + cislo1 + " a " + cislo2 + " je " + odcitaj(cislo1, cislo2));
        System.out.printf("\nVysledkom nasobenia hodnôt " + cislo1 + " a " + cislo2 + " je " + vynasob(cislo1, cislo2));
       // System.out.printf("\nVysledkom delenia hodnôt " + cislo1 + " a " + cislo2 + " je " + vydel(cislo1, cislo2));
        System.out.printf("\nVysledkom delenia hodnôt  %.1f a %.1f, je: %.1f  ", cislo1, cislo2, vydel(cislo1, cislo2));
        System.out.printf("\nVysledkom modula hodnôt " + cislo1 + " a " + cislo2 + " je " + zvysokPoDeleni(cislo1, cislo2));
    }
}
