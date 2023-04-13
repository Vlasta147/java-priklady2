// Vytvorte jednoduchý program, ktorého cieľom bude výpočet 4 základných matematických operácií
// a to na sčítanie, odčítanie, násobenie a delenie.
// Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných,
// napr. cislo1  a cislo2.
//
//Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
//Program nám zároveň vypíše takýto text:
//Výsledkom sčítanie hodnôt 2 a 3 je 5.
//Výsledkom odčítania hodnôt 2 a 3 je -1.
//atď.
//pridana operacia modulo 29.3.2023

public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
        double cislo1 = 1;
        double cislo2 = 4;

        double scitanie = cislo1+cislo2;
        String DesScitanie = String.format("%.2f", scitanie);
        double odcitanie = cislo1-cislo2;
        String DesOdcitanie = String.format("%.2f", odcitanie);
        double nasobenie = cislo1*cislo2;
        String DesNasobenie = String.format("%.2f", nasobenie);
        double delenie = cislo1/cislo2;
        String DesDelenie = String.format("%.2f", delenie);

        /* reprezentuje zvy&scaron;ok po deleni */
        double modulo = cislo1%cislo2;

        System.out.println("Vysledkom scitania hodnôt " + cislo1 + " a " + cislo2 + " je sucet " + scitanie);
        System.out.printf("\nVysledkom scitania hodnôt " + cislo1 + " a " + cislo2 + " je sucet " + DesScitanie);
        System.out.println("\nVysledkom odčítania hodnôt " + cislo1 + " a " + cislo2 + " je rozdiel " + odcitanie);
        System.out.printf("\nVysledkom odčítania hodnôt " + cislo1 + " a " + cislo2 + " je rozdiel " + DesOdcitanie);
        System.out.println("\nVysledkom násobenia hodnôt " + cislo1 + " a " + cislo2 + " je súčin " + nasobenie);
        System.out.printf("\nVysledkom násobenia hodnôt " + cislo1 + " a " + cislo2 + " je súčin " + DesNasobenie);
        System.out.println("\nVysledkom delenia hodnôt " + cislo1 + " a " + cislo2 + " je podiel " + delenie);
        System.out.printf("\nVysledkom delenia hodnôt " + cislo1 + " a " + cislo2 + " je podiel " + DesDelenie);
        System.out.printf("\nVysledkom modula hodnôt " + cislo1 + " a " + cislo2 + " je " + modulo);

        //odsitanie so zaokrulenim, resp.vypisanie do konzoly spolu so zaokrulenim
        //System.out.printf("\nVysledkom odcitania hodnôt %.2f a %2.f je %.2f ", cislo1, cislo2, odcitanie);
    }
}
