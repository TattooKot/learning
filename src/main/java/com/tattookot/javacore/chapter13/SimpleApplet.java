package main.java.com.tattookot.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {
    public void paint(Graphics g){
        g.drawString("Simplest string", 20, 20);
    }
}