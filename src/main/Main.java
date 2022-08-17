package main;

import figuren2d.Hexagon;
import figuren2d.Kreis;
import figuren3d.Kreiskegel;

public class Main {

    public static void main (String[] args) {
        Hexagon hex = new Hexagon(5);
        Kreis kreis = new Kreis(5);
        Kreiskegel kreiskegel = new Kreiskegel(kreis, 15);
        System.out.println(kreiskegel.volumen());
        System.out.println(kreiskegel.oberflaeche());
    }
}
