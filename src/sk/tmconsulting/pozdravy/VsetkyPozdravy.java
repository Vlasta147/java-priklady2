package sk.tmconsulting.pozdravy;

import sk.tmconsulting.pozdravy.anglicky.PozdravAnglicky;
import sk.tmconsulting.pozdravy.madarsky.PozdravMadarsky;
import sk.tmconsulting.pozdravy.nemecky.PozdravNemecky;
import sk.tmconsulting.pozdravy.slovensky.PozdravSlovensky;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        PozdravAnglicky.vypis();
        PozdravNemecky.vypis();
        PozdravMadarsky.vypis();
        PozdravSlovensky.vypis();
    }
}
