package Opdracht6_1;

import java.awt.*;
import java.applet.*;

public class Geld extends Applet {
    double personen, hoeveelheid, uitkomst;

    public void init() {
        personen = 4;
        hoeveelheid = 113;
        uitkomst = hoeveelheid / personen;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20,40);
        g.drawString("Jeanette: " + uitkomst, 20,60);
        g.drawString("Namara: " +uitkomst,20,80);
    }
}
