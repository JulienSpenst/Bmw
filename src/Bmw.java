import GLOOP.*;
public class Bmw{
    GLQuader quader;
    Parkplatz park1;
    double vX,vZ;
    double score;
    double breite, tiefe;

    public Bmw() {
        quader = new GLQuader(0,0,0,100,50,100);
        quader.verschiebe(0,20,0);
        quader.setzeFarbe(1,0,0);
        //quader.setzeTextur("src/img/bmw.png");
    }
    public void score(){
        score++;
    }
    public double GibScore(){
        return score;
    }
    public void bewegeLinks(){
        quader.verschiebe(-1.5,0,0);
    }
    public void bewegeRechts(){
        quader.verschiebe(1.5,0,0);
    }
    public void bewegevorne(){
        quader.verschiebe(0,0,-1.5);
    }
    public void bewegehinten(){
        quader.verschiebe(0,0,1.5);
    }
    public double gibX(){
        return quader.gibX();
    }
    public double gibY(){
        return quader.gibY();
    }
    public double gibZ(){
        return quader.gibZ();
    }

}
