package figuren3d;

public abstract class Figur3D {


    public abstract double oberflaeche();

    public abstract double volumen();

    @Override
    public String toString() {
        return "Oberflaeche: " + this.oberflaeche() + "\n" + "Volumen: " + this.volumen();
    }
}
