package sk.tmconsulting.rozhrania;

public interface IKlientPrototyp { //I znamena interface, nie je to trieda
    int akoCastoNavstevujeDanuSluzbu(Klient klient); /* Zistujeme pocet navstev danej sluzby*/
    boolean jePocitacovoGramotny(Klient klient);
    void zobrazOsobneUdaje(Klient klient);
    boolean posielatElektronickeVypisy();

// tieto tri veci sú ako keby buduce triedy
    // je to zaciatok
}
