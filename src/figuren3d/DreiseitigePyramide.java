package figuren3d;


import figuren2d.Dreieck;

public class DreiseitigePyramide extends Pyramide<Dreieck> {

    public DreiseitigePyramide(Dreieck grundflaeche, double hoehe ) {

        super(grundflaeche, hoehe);
    }

    @Override
    public double mantelflaeche() {

        double sha= (1/2.0)*Math.sqrt((2*Math.pow(this.getGrundflaeche().getSeiteB(), 2))+(2*Math.pow(this.getGrundflaeche().getSeiteC(), 2))-Math.pow(this.getGrundflaeche().getSeiteA(), 2));
        double seitenlaenge = Math.sqrt(Math.pow(getHoehe(), 2)+(Math.pow((2*sha), 2)));
        Dreieck dreieckA = new Dreieck(this.getGrundflaeche().getSeiteA(), seitenlaenge, seitenlaenge);
        Dreieck dreieckB = new Dreieck(this.getGrundflaeche().getSeiteB(), seitenlaenge, seitenlaenge);
        Dreieck dreieckC = new Dreieck(this.getGrundflaeche().getSeiteC(), seitenlaenge, seitenlaenge);

        return dreieckA.flaeche() + dreieckB.flaeche() + dreieckC.flaeche();
    }
    
}
