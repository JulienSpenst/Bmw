import GLOOP.*;
public class Kugelfangen {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;
    private Bmw bmw;
    private Reifen kugel1, kugel2, kugel3;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 1000, 1800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

        bmw=new Bmw();

        Parkplatz parkplatz = new Parkplatz(2000, 2000);

        fuehreAus();
    }

    public void fuehreAus() {
        while (!tastatur.esc()) {
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
}

