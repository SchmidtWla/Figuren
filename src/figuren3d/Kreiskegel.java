package figuren3d;

import figuren2d.Kreis;

public class Kreiskegel extends Pyramide<Kreis>{

    public Kreiskegel(Kreis grund, double hoehe) {
        super(grund, hoehe);
    }

    @Override
    public double mantelflaeche() {

        double seitenlaenge = Math.sqrt((Math.pow(getHoehe(),2) + Math.pow(this.getGrundflaeche().getRadius(),2)));
        return this.getGrundflaeche().getRadius() * seitenlaenge * Math.PI;
    }
}
