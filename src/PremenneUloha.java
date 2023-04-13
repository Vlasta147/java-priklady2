// Zadanie na program
// Vypíšte do konzoly nasledujúci text:
//
// Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi
// do nového zamestnania ako Java programátor.
// V Bratislave dňa 18.06.2022





import java.text.SimpleDateFormat;
import java.util.Date;

public class PremenneUloha {
    public static void main(String[] args) {
        String meno = "Jozef Mrkvička";
        String mesiac = "septembra";
        // Zadefinovanie premennej s nazvom datumNarodenia a naplnenie konkretneho datumu. String je datovy typ pre text.
        String datumNarodenia = "03.04.2000";


        // Zadefinovanie premennej s nazvom znamka, ktora na zaciatku obsahuje hodnotu 1.5
        double znamka = 1.5;

        String znamkaSDesatinnouCiarkou = String.format("%.1f", znamka); //prekonvertovali sme znamku na znamku s desatinnou ciarkou
        // %.1f reprezentuje cislo na jedno desatinne miesto, %.2f reprezentuje cislo na dve desatinne miesta

        int rok = 2022;

       // String aktualnyDatum = "18.06.2022"
        Date aktualnyDatum = new Date(); // vytvorili sme premennu aktualnyDatum reprezentujuci aktualny datum,ale v anglickom formate
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy"); // A my ten anglicky format musime preklopit na slovensky


        System.out.println("Študent" + meno + " sa narodil " + datumNarodenia + ", z maturitnej skúšky má známku " + znamkaSDesatinnouCiarkou +
                " a od " + mesiac + " " + rok + " nastúpi do nového zamestnania ako Java programátor. \n" +
                "\tV Bratislave dňa " + formatDatumu.format(aktualnyDatum));


    }

}

