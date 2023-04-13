package ulohy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MaticaUdajovNasobok {
    public static void main(String[] args) {

        final int MAX = 25;
        for (int i = 1; i <= MAX; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Pre dvojnasobok hodnoty
        int j = 1;
        for (int i = 1; i <= MAX; i++) {
            if (i % 5 == 0) {
                System.out.println(j);
            } else {
                System.out.print(j + " ");
            }
            j = j * 2;
        }
        System.out.println();
        //Vypiseme aktualny cas
        String timeStampStart2 = new SimpleDateFormat("HH:mm:ss:SS").format(Calendar.getInstance().getTime());
        System.out.println(timeStampStart2);

    }
}

