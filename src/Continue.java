public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //if (i == 2) continue; // Pri hodnote i == 2 preskoci na dalsiu iteraciu, vynecha 2

                //ROZNE SPOSOBY UKONCENIA PROGRAMU:
                //if (i == 7) break; //Ukonci cyklus pri hodnote 7
                //if (i == 7)System.exit(1); //Ukonci cely pogram, ktoremu sme priradili cislo 1, uz mi ani nevypise "Koniec progamu"
                if (i == 7) return; // Ukonci cyklus aj program, nevypise mi "Koniec programu"
                System.out.println(i);
            }
        }
        System.out.println("Koniec programu");
    }

}
