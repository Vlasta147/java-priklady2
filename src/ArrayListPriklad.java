import java.util.ArrayList;
import java.util.List;

public class ArrayListPriklad {
    public static void main(String[] args) {
        // Scenar c. 1 - ukazka ArrayList naplnenie udajov roznych datovych typov, cize cisiel, textov,...
        ArrayList dynamickePoleCisiel = new ArrayList<>();

        // Naplname dynamicke pol,cize Arraylist roznzmi honotami, ciselnymi, ale aj textovzmi
        // Poznamka: do dynamickeho pola budeme vkladat aj objekty, napr. pre nase vzdelavanie to bude Kniha alebo Zamestnanec
        dynamickePoleCisiel.add(1);
        dynamickePoleCisiel.add(2.5);
        dynamickePoleCisiel.add("Nejaký text");
        dynamickePoleCisiel.add("3");

        // Vypiseme dynamicke pole, teda ArrayList
        // Prvy scenar bude vypis dynamickeho pola cez klasicky prikaz for
        for (int i = 0; i < dynamickePoleCisiel.size(); i++) { // Cyklus s pevnym poctom opakovani "fori"
            System.out.println(dynamickePoleCisiel.get(i));
        }

        // Scenar c.2 - Ukazka ArrayList naplnenim iba textovych udajov, teda s rovnakymi datovymi typmi
        List<String> dynamickePoleTextov = new ArrayList<>();
        dynamickePoleTextov.add("Honda");
        dynamickePoleTextov.add("Audi");
        dynamickePoleTextov.add("BMW");
        dynamickePoleTextov.add("Peugeot");

        System.out.println("Výpis obsahu dynamickeho poľa cez for s pevným počtom opakovaní");
        // Vypiseme cez prikaz for, teda cyklom s pevnym poctom opakovani
        for (int i = 0; i < dynamickePoleTextov.size(); i++) {
            System.out.println(dynamickePoleTextov.get(i));
        }

        System.out.println("\nVýpis obsahu dynamického poľa cez for each");
        // Alebo vypiseme obsah dynamickeho pola, teda ArrayList-u cez for each
        for (String konkretnyText : dynamickePoleTextov) {
            System.out.println(konkretnyText);
        }

        // Scenar c. 3 - ukayka ArrayList naplenim iba ciselnch udajov, teda s rovnakymi typmi
        // Dynamicke pole s cislami mozeme vytvorit iba s pouzitim objektu Integer, Double, Float - velkymi pismenami
        ArrayList<Integer> dynamickePoleIbaSCislami = new ArrayList<Integer>();
        dynamickePoleIbaSCislami.add(-1);
        dynamickePoleIbaSCislami.add(5);
        dynamickePoleIbaSCislami.add(9999);

        System.out.println("\nVýpis obsahu dynamického poľa cisiel cez for each");
        for (Integer konkretneCislo : dynamickePoleIbaSCislami) {
            System.out.println(konkretneCislo);

        }


    }
}