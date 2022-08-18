package figuren3d;


import figuren2d.Dreieck;

public class DreiseitigePyramide extends Pyramide {

    public DreiseitigePyramide(Dreieck grundflaeche, double hoehe ) {

        super(grundflaeche, hoehe);
    }

    @Override
    public double mantelflaeche() {
        Dreieck eck = (Dreieck)getGrundflaeche();
        double sha= (1/2.0)*Math.sqrt((2*Math.pow(eck.getSeiteB(), 2))+(2*Math.pow(eck.getSeiteC(), 2))-Math.pow(eck.getSeiteA(), 2));
        double seitenlaenge = Math.sqrt(Math.pow(getHoehe(), 2)+(Math.pow((2*sha), 2)));
        Dreieck dreieckA = new Dreieck(eck.getSeiteA(), seitenlaenge, seitenlaenge);
        Dreieck dreieckB = new Dreieck(eck.getSeiteB(), seitenlaenge, seitenlaenge);
        Dreieck dreieckC = new Dreieck(eck.getSeiteC(), seitenlaenge, seitenlaenge);

        return dreieckA.flaeche() + dreieckB.flaeche() + dreieckC.flaeche();
    }
    
}
