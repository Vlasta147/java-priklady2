public class Premenne {
    public static void main(String[] args) {
        String meno = "Vlasta";
        int celeČislo = 123;
        float desatinneČislo = 234.56f;
        double desatinneČisloAkoDouble = 1.23;
        char znak = 'A'; //AltGr p    vlozi znak ´
        boolean jeDnesStreda = true; // true znamena, ze je to pravda (ano), false je nepravda
        int celeČislo2;
        celeČislo2 = 456;
        int celeČislo3 = 789;
            celeČislo3 = 0; // Naplnili pemennu celeČíslo3 hodnotou, zmenili sme povodnu hodnotu 789


        double cenaBezDPH = 1000.0;
        double cenaSDPH = 0.0;

        cenaSDPH = cenaBezDPH * 1.20; // Premmenu cenaBezDPH sme vynasobili 1,20 a vysledok sme umiestnili spat do
        // premennej cenaSDPH
        System.out.println("Cena bez DPH: " + cenaBezDPH);
        System.out.println("Cena s DPH: " + cenaSDPH);


        System.out.println("Meno:" + meno);
        System.out.println("Celé číslo: " + celeČislo);
        System.out.println("Desatinné číslo: " + desatinneČislo);
        System.out.println("Desatinné číslo ako double: " + desatinneČisloAkoDouble);
        System.out.println("Vypísaný znak: " + znak);
        System.out.println("Je dnes streda? " + jeDnesStreda);
        System.out.println("Celé číslo2: " + celeČislo2);
        System.out.println("Celé číslo3: " + celeČislo3);
        System.out.println("\f uvodzovky spodne \f ");

        // Ako nafromatovat cislo v Sk formate na 2 desatinne miesta, pouzijeme %.2f
        System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneČislo);


    }


}