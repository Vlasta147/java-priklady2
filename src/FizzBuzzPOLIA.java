import java.util.Scanner;

public class FizzBuzzPOLIA {
        public static void main(String[] args) {
    // TODO: chceme urobiť konzolovy vstup, v ktorom by pouzivatel zadal cislo v tvare napr. 3 8 12 45 98
    Scanner scn = new Scanner(System.in);
    System.out.println("Zadaj cisla napr. v tvare 3 8 12 45 98");
    String vstupneHodnoty = scn.nextLine();  // Priamy pouzivatelsky vstup, konzola ocakava zadania hodnot

    System.out.println("Zadane vstupne hodnoty sú: " + vstupneHodnoty);
    // TODO: ako rozdelit jednotlive hodnoty zo vstpneHodnoty, abz algoritmus vedel ich jednotlivo vyhodnotiť

    String[] poleHodnot = vstupneHodnoty.split(" "); // vytvorili sme pole TEXTOVYCH hodnot pouzitim prikazu
    // split - rozdelit cez medzeru preto je medzera medzi "" V ()
    //System.out.println("Pole individualnych zadanych hodnot je: " +poleHodnot);
    for (int i = 0; i < poleHodnot.length; i++) { // cyklus s pevnym poctom opakovaní
        String individualnaHodnota = poleHodnot[i];
        int hodnota = Integer.parseInt(individualnaHodnota); //Prekonvertovali sme cislo ako text na realne
        // cele cislo, teda int

        // TODO: zjednodusit podmienku nizsie
        // if ((hodnota % 3 == 0) && (hodnota % 5 == 0)) {
        if (hodnota % 15 == 0) {
            System.out.print("Fizz Buzz");
        } else if (hodnota % 3 == 0) {
            System.out.print("Fizz");
        } else if (hodnota % 5 == 0) {
            System.out.print("Buzz");
        } else {
            System.out.print(hodnota);
        }
        System.out.print(" ");
    }
}
}
//System.out.println(poleHodnot[i]); //vypiseme individualne hodnoty


// int hodnota = 17;

// TODO: zjednodusit podmienku nizsie
// if ((hodnota % 3 == 0) && (hodnota % 5 == 0)) {

