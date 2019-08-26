package com.mutexunlocked;

import java.awt.*;
import java.awt.geom.Area;
import javax.swing.*;

public class Main extends Canvas
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Brid");

        Canvas canvas = new Main();

        canvas.setSize(800, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g)
    {
        Graphics2D gd2 =  (Graphics2D) g.create();
        GradientPaint beakc = new GradientPaint(
                0f, 0f, Color.CYAN, 100f, 0f, Color.YELLOW);
        GradientPaint waterc = new GradientPaint(
                50f, 50f, Color.CYAN, 600f, 50f, Color.BLUE);

        Rectangle neck = new Rectangle(200, 170, 90, 130);
        int xpoints[] = {25, 145, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};

        gd2.setPaint(beakc);
        gd2.fillPolygon(xpoints, ypoints, xpoints.length);

        Font d = g.getFont();
        int fontSize = d.getSize();
        g.setColor(Color.PINK);

        // x y width height
        g.fillOval(70, 0, 250, 200);
        g.setColor(Color.BLUE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize * 7));
        g.drawString("\u004f", 140, 90);
        gd2.setColor(Color.cyan);
        gd2.fill(neck);

        g.setColor(Color.PINK);
        // x y width height
        g.fillOval(260, 200, 350, 200);

        //x1 y1 x2 y2
        g.setColor(Color.cyan);
        g.drawLine(600,300,900,70);
        g.setColor(Color.cyan);
        g.drawLine(610,310,910,80);
        g.setColor(Color.cyan);
        g.drawLine(605,305,905,75);

        Rectangle water = new Rectangle(0,400,800,100);

        gd2.setPaint(waterc);
        gd2.fill(water);
    }
}
