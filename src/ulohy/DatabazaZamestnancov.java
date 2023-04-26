package ulohy;

import java.util.ArrayList;

public class DatabazaZamestnancov {
    public static void main(String[] args) {
        /*Vytvorime zamestnanca cez prikaz new a nazov triedy, cize vytvorime objekt zamestnanec1 alebo synonymum je
        instancia triedy*/
        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.meno = "Vlasta";
        zamestnanec1.priezvisko = "Kunecová";
        zamestnanec1.pohlavie = 'ž'; // apostrof AltGr p
        zamestnanec1.rok = 2000;

        System.out.println(zamestnanec1.meno);
        System.out.println(zamestnanec1.priezvisko);
        System.out.println(zamestnanec1.pohlavie);
        System.out.println(zamestnanec1.rok);

        // Chceme vytvorit dalsieho zamestnanca, cize zamestnanca c. 2
        Zamestnanec zamestnanec2 = new Zamestnanec();
        zamestnanec2.meno = "Jozef";
        zamestnanec2.priezvisko = "Mrkvička";
        zamestnanec2.pohlavie = 'm'; // apostrof AltGr p
        zamestnanec2.rok = 2010;

        System.out.println(zamestnanec2.meno);
        System.out.println(zamestnanec2.priezvisko);
        System.out.println(zamestnanec2.pohlavie);
        System.out.println(zamestnanec2.rok);

        // Chceme vlozit zamestnancov do ArrayListu
        ArrayList<Zamestnanec> dynamickePoleZamestancov = new ArrayList<Zamestnanec>();
        dynamickePoleZamestancov.add(zamestnanec1);
        dynamickePoleZamestancov.add(zamestnanec2);

        // Ako ich vypisat
        // Hint: pouzijeme foreach
        System.out.println("Vypisujem zamestnancov cez for each");

        for (Zamestnanec konkretnyZamestnanec: dynamickePoleZamestancov) {
            System.out.println(konkretnyZamestnanec.meno);
            System.out.println(konkretnyZamestnanec.priezvisko);
            System.out.println(konkretnyZamestnanec.pohlavie);
            System.out.println(konkretnyZamestnanec.rok);


    }

    }
}
