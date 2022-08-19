package figuren3d;

import figuren2d.Figur2D;

public abstract class Pyramide<T extends Figur2D> extends Figur3D {

    private double hoehe;
    private T grundflaeche;

    public Pyramide(T grund, double hoehe) {
        this.grundflaeche = grund;
        this.hoehe = hoehe;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        if (hoehe > 0) {
            this.hoehe = hoehe;
        } else {
            throw new IllegalArgumentException("The height must be greater than 0 ");
        }
    }

    public T getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(T grundflaeche) {
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
