import GLOOP.*;
public class Parkplatz {
    private GLQuader untergrund;
    private double breite, tiefe;

    public Parkplatz(double pBreite, double pTiefe){
        breite = pBreite;
        tiefe = pTiefe;
        untergrund = new GLQuader(0,0,0, breite,20,tiefe);
        untergrund.setzeTextur("src/img/parkplatz.jpg");
    }
}
