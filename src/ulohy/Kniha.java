package ulohy;

public class Kniha {
    private String nazov;

    public Kniha() {
        // Tu moze byt kludne inicalizacia ineho (zavisleho) objektu, napr. konekcia do databazy MySQL alebo nejakych inych premennych
    }

    public Kniha(String nazov, String autor, String zaner, String vydavatelstvo, int pocetStran) {
        this.nazov = nazov;
        this.autor = autor;
        this.zaner = zaner;
        this.vydavatelstvo = vydavatelstvo;
        this.pocetStran = pocetStran;
    }

    private String autor;
    private String zaner;
    private String vydavatelstvo;

    // Vygenerovali sme settery a gettery pre tuto triedu, hovorime tomu Encapsulation (zapúzdrenie, enkapsulácia)
    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public String getVydavatelstvo() {
        return vydavatelstvo;
    }

    public void setVydavatelstvo(String vydavatelstvo) {
        this.vydavatelstvo = vydavatelstvo;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    private int pocetStran;

}
