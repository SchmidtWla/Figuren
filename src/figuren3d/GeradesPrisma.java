package figuren3d;

import figuren2d.Figur2D;

public class GeradesPrisma extends Figur3D {

    Figur2D grundflaeche;
    double hoehe;

   public GeradesPrisma(Figur2D grundflaeche, double hoehe) {
       this.grundflaeche = grundflaeche;
       this.hoehe = hoehe;
   }

    public Figur2D getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(Figur2D grundflaeche) {
        this.grundflaeche = grundflaeche;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
       if(hoehe > 0 ) {
           this.hoehe = hoehe;
       } else {
           throw new IllegalArgumentException("Height must be greater than 0");
       }
    }

    @Override
    public double oberflaeche() {
    return 2 * this.grundflaeche.flaeche() + this.grundflaeche.umfang() * 2;
    }

    @Override
    public double volumen() {
        return this.grundflaeche.flaeche() * this.hoehe;
    }
}
