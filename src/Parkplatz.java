import GLOOP.*;
public class Parkplatz {
    private GLQuader untergrund,wl,wr,wh,wv;
    private double breite, tiefe;

    public Parkplatz(double pBreite, double pTiefe){
        breite = pBreite;
        tiefe = pTiefe;
        untergrund = new GLQuader(0,0,0, breite,20,tiefe);
        wh = new GLQuader(0,0,0,100,100,2000);
        wh.verschiebe(0,25,-1000);
        wh.drehe(0,90,0);
        wv = new GLQuader(0,0,0,100,100,2000);
        wv.verschiebe(0,25,1000);
        wv.drehe(0,90,0);
        wl = new GLQuader(0,0,0,100,100,2000);
        wl.verschiebe(-950,25,0);
        wr = new GLQuader(0,0,0,100,100,2000);
        wr.verschiebe(950,25,0);
    }
  public double gibBreite(){
        return breite;
  }
    public double gibTiefe(){
        return tiefe;
    }
}
