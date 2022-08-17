package figuren3d;

import figuren2d.Kreis;

public class Kreiskegel extends Pyramide{

    public Kreiskegel(Kreis grund, double hoehe) {
        super(grund, hoehe);
    }

    @Override
    public double mantelflaeche() {
        Kreis kreis = (Kreis)this.getGrundflaeche();
        double seitenlaenge = Math.sqrt((Math.pow(getHoehe(),2) + Math.pow(kreis.getRadius(),2)));
        return kreis.getRadius() * seitenlaenge * Math.PI;
    }
}
