package figuren3d;

import figuren2d.Figur2D;

public abstract class Pyramide extends Figur3D{

    private double hoehe;
    private Figur2D grundflaeche;

    public Pyramide(Figur2D grund, double hoehe) {
        this.grundflaeche = grund;
        this.hoehe = hoehe;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public Figur2D getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(Figur2D grundflaeche) {
        this.grundflaeche = grundflaeche;
    }

    public abstract double mantelflaeche();

    @Override
    public double oberflaeche() {
        return this.grundflaeche.flaeche() + this.mantelflaeche();
    }

    @Override
    public double volumen() {
        return (this.grundflaeche.flaeche() * this.hoehe) / 3.0;
    }
}
