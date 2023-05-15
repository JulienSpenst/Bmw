import GLOOP.*;
public class Kugelfangen {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;
    private GLTafel tafel1;
    private Bmw bmw;
    private Parkplatz parkplatz;
    private Reifen kugel1, kugel2, kugel3;

    Reifen[]reifenen;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 1000, 1800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

        bmw=new Bmw();
        parkplatz = new Parkplatz(2000,2000);

        reifenen = new Reifen[100];
        for (int i = 0; i < reifenen.length; i++) {
            reifenen[i]= new Reifen(bmw,parkplatz);
        }

        tafel1 = new GLTafel(0,0,0,2000,2000);
        tafel1.verschiebe(0,300,-2000);
        fuehreAus();

    }

    public void fuehreAus() {
        while (!tastatur.esc()) {
            this.updateReifen();
            this.updateTafel();
            if (tastatur.rechts() && bmw.gibX() < 850) {
                bmw.bewegeRechts();
            }
            if (tastatur.links() && bmw.gibX() > -850) {
                bmw.bewegeLinks();
            }
            if (tastatur.oben() && bmw.gibZ() > -850) {
                bmw.bewegevorne();
            }
            if (tastatur.unten() && bmw.gibZ() < 850) {
                bmw.bewegehinten();
            }
            Sys.warte();
        }
    }
    public void updateReifen(){
        for (int i = 0; i < reifenen.length; i++) {
            reifenen[i].reifenrolle();
        }
    }
    public void updateTafel(){
        tafel1.setzeText("score: "+bmw.GibScore(),300);
    }
}

