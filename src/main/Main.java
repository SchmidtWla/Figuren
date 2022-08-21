package main;

import figuren2d.Dreieck;
import figuren2d.Hexagon;
import figuren2d.Kreis;
import figuren2d.N_Eck;
import figuren3d.DreiseitigePyramide;
import figuren3d.Kreiskegel;
import figuren3d.RegelmaessigePyramide;

public class Main {

    public static void main(String[] args) {

        Kreis kreis = new Kreis(5);
        Kreiskegel kreiskegel = new Kreiskegel(kreis, 15);
        System.out.println("Kreiskegel: " + "\n" + kreiskegel.toString() + "\n");

        Dreieck dreieck = new Dreieck(5, 5, 5);
        DreiseitigePyramide dreiseitigePyramide = new DreiseitigePyramide(dreieck, 6);
        System.out.println("DreiseitigePyramide: " + "\n" + dreiseitigePyramide.toString() + "\n");

        N_Eck n_eck = new N_Eck(5, 4);
        RegelmaessigePyramide pyramide = new RegelmaessigePyramide(n_eck, 6);
        System.out.println("RegelmaessigePyramide: " + "\n" + pyramide.toString() + "\n");
    }
}
