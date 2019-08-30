package Opdracht6_2;

import java.awt.*;
import java.applet.*;

public class Seconden extends Applet {
    int uur;
    int dag;
    int jaar;

    public void init() {
        uur = 60 * 60;
        dag = 24 * uur;
        jaar = 365 * dag;
    }

    public void paint(Graphics g) {
        g.drawString("In een uur zitten " + uur + " seconden",20,20);
        g.drawString("In een dag zitten " + dag + " seconden",20,40);
        g.drawString("In een jaar zitten " + jaar + " seconden",20,60);
    }
}
