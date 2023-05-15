import GLOOP.*;
public class Reifen {
    private GLZylinder reifen;
    private Parkplatz feld;

    private double radius;
    double xspeed, zspeed;
    double abstand;

    private boolean istAktiv;
    private double vX, vZ;
    Bmw bmw;
    Parkplatz parkplatz;


    public Reifen(Bmw pbmw, Parkplatz pparkplatz) {
        reifen = new GLZylinder(Math.random() * 1500 - 750, 0, Math.random() * 1500 - 750, 20, 25);
        reifen.drehe(90, 0, 0);
        reifen.setzeFarbe(Math.random(),Math.random(),Math.random());
        xspeed = Math.random() * 2 - 1;
        zspeed = Math.random() * 2 - 1;
        reifen.verschiebe(0, 20, 0);
        bmw = pbmw;
        parkplatz = pparkplatz;

    }

    public void reifenrolle() {
        if(-parkplatz.gibTiefe()/2>= reifen.gibZ()-20||+parkplatz.gibTiefe()/2<= reifen.gibZ()+20){
            zspeed = -zspeed;
        }
        if(-parkplatz.gibBreite()/2>= reifen.gibX()-20||+parkplatz.gibBreite()/2<= reifen.gibX()+20){
            xspeed = -xspeed;
        }
        reifen.drehe(0, Math.random() * 2 - 1, 0);
        reifen.verschiebe(xspeed, 0, zspeed);
        if(getroffen()){
            reifen.setzePosition(-1000000,-1000000,0);
        }
    }

    public boolean getroffen() {
        abstand = Math.sqrt(Math.pow(reifen.gibX() - bmw.gibX(), 2)+Math.pow(reifen.gibZ() - bmw.gibZ(), 2));
        if (abstand < 60) {
            bmw.score();
            return true;
        } else {
            return false;
        }

    }
}
