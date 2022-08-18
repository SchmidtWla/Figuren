package figuren3d;

import figuren2d.Dreieck;
import figuren2d.Figur2D;
import figuren2d.Rechteck;

public class VierseitigePyramide extends Pyramide {


    public VierseitigePyramide(Rechteck grund, double hoehe) {
        super(grund, hoehe);
    }

    @Override
    public double mantelflaeche() {
        Rechteck rechteck = (Rechteck)this.getGrundflaeche();
        double diagonale = Math.sqrt(Math.pow(rechteck.getHoehe(),2) + Math.pow(rechteck.getBreite(),2));
        double s = Math.sqrt(Math.pow(this.getHoehe(),2) + Math.pow((diagonale/2),2));
        Dreieck dreieckA = new Dreieck(rechteck.getBreite(),s,s);
        Dreieck dreieckB = new Dreieck(rechteck.getHoehe(),s,s);
        return (2 * dreieckA.flaeche()) + (2 * dreieckB.flaeche());
    }
}
