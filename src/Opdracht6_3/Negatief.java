package Opdracht6_3;

import java.awt.*;
import java.applet.*;

public class Negatief extends Applet {
    int positief;

    public void init() {
        positief = 2147483647;
    }

    public void paint(Graphics g) {
        positief++;
        g.drawString("" + positief,20,20);
    }
}
