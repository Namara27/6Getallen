package Opdracht6_4;

import java.awt.*;
import java.applet.*;

public class Gemiddelde extends Applet {
    double a, b, c;
    double gemiddelde;
    double eerste;
    int tweede;
    double derde;
    double vierde;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        gemiddelde = (a + b + c) / 3;
        eerste = gemiddelde * 10;
        tweede = (int) eerste;
        derde = tweede;
        vierde = derde / 10;

            }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + vierde ,20,20);

    }
}
