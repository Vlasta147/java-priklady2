package opakovanie;

public class PoleDva {
    public static void main(String[] args) {
        int[] cisla = {0, 1, 8, 10, 12, 99};

        System.out.println("cisla delitelne dvomi");
        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] % 2 == 0) {
                System.out.println(cisla[i] + " ");
            }

        }
        System.out.println("cisla nedelitelne dvomi");
        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] % 2 != 0) {
                System.out.println(cisla[i] + " ");
            }
        }
    }
}

