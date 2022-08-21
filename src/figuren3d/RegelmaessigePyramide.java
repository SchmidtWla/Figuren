package figuren3d;

import figuren2d.Dreieck;
import figuren2d.Figur2D;
import figuren2d.N_Eck;

public class RegelmaessigePyramide extends Pyramide<N_Eck>{
    public RegelmaessigePyramide(N_Eck grund, double hoehe) {
        super(grund, hoehe);
    }

    @Override
    public double mantelflaeche() {

        double seitenlaenge = Math.sqrt(Math.pow(this.getHoehe(), 2) + Math.pow(this.getGrundflaeche().aussenKreisRadius(),2));
        Dreieck dreieck = new Dreieck(this.getGrundflaeche().getSeitenLaenge(), seitenlaenge, seitenlaenge);
        return dreieck.flaeche() * this.getGrundflaeche().getN();
    }
}
