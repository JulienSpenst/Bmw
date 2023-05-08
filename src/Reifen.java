import GLOOP.*;
public class Reifen {
    private GLZylinder reifen;
    private Parkplatz feld;
    
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    Bmw bmw;

    public Reifen(Bmw pbmw){
        reifen = new GLZylinder(Math.random() * 1500-750,0, Math.random() *1500-750,20,25);
        reifen.drehe(90,0,0);
        reifen.verschiebe(0,20,0);
        bmw = pbmw;
    }

}
