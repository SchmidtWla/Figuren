package figuren3d;

public class Kugel extends Figur3D {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double oberflaeche() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volumen() {
        return 4/3.0 * Math.PI * Math.pow(radius, 3);
    }
}
