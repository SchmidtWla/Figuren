package figuren3d;

import figuren2d.Dreieck;
import figuren2d.Figur2D;
import figuren2d.N_Eck;

public class RegelmaessigePyramide extends Pyramide{
    public RegelmaessigePyramide(N_Eck grund, double hoehe) {
        super(grund, hoehe);
    }

    @Override
    public double mantelflaeche() {
        N_Eck n_eck = (N_Eck) this.getGrundflaeche();
        double seitenlaenge = Math.sqrt(Math.pow(this.getHoehe(), 2) + Math.pow(n_eck.aussenKreisRadius(),2));
        Dreieck dreieck = new Dreieck(n_eck.getSeitenLaenge(), seitenlaenge, seitenlaenge);
        return dreieck.flaeche() * n_eck.getN();
    }
}
