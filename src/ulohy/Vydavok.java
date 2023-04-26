package ulohy;

public class Vydavok {
    private String nazov;
    private double vyskaKonkretnehoVydavku;
    private boolean jeOsobny;

    // Konstruktor

    public Vydavok() {
    }

    public Vydavok(String nazov, double vyskaKonkretnehoVydavku, boolean jeOsobny) {
        this.nazov = nazov;
        this.vyskaKonkretnehoVydavku = vyskaKonkretnehoVydavku;
        this.jeOsobny = jeOsobny;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getVyskaKonkretnehoVydavku() {
        return vyskaKonkretnehoVydavku;
    }

    public void setVyskaKonkretnehoVydavku(double vyskaKonkretnehoVydavku) {
        this.vyskaKonkretnehoVydavku = vyskaKonkretnehoVydavku;
    }

    public boolean isJeOsobny() {
        return jeOsobny;
    }

    public void setJeOsobny(boolean jeOsobny) {
        this.jeOsobny = jeOsobny;
    }
}
