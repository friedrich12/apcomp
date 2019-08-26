/*
 * Created by Friedrich Doku
 */
package com.mutexunlocked;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

import static java.lang.Math.PI;
import static java.lang.Math.acos;

public class Main {

    public static void main(String[] args) {
        double sides[] = new double[3];
        JFrame frame = new JFrame("Input");
        for(int i = 0; i < 3; i++){
            String side = JOptionPane.showInputDialog(frame,
                    "Enter length of side " + Integer.toString(i +1));
            sides[i] = Double.valueOf(side);
            System.out.println(side);
        }
        // Do Heron's stuff
        double s = 0.5 * (Arrays.stream(sides).sum());
        double area = Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
        JFrame frame2 = new JFrame("Message");
        String ans1 = "The area of your " + Double.toString(sides[0]) + ", " +
                Double.toString(sides[1]) + ", " + Double.toString(sides[2]) + " triangle is " + Double.toString(area);
        JOptionPane.showMessageDialog(frame2, ans1);

        // Law of cosine stuff
        double a2 = Math.pow(sides[0],2);
        double b2 = Math.pow(sides[1],2);
        double c2 = Math.pow(sides[2],2);
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        double C = acos((c2-a2-b2)/(-2*a*b));
        double B = acos((b2-c2-a2)/(-2*c*a));
        double A = acos((a2-c2-b2)/(-2*c*b));

        //Print the output
        String ans2 = "The angles for your triangle are " + Double.toString(Math.round((float) (A * 180 / PI))) + ", " +
                Double.toString(Math.round((float) (B * 180 / PI))) + ", " + Double.toString(Math.round((float) (C * 180 / PI)));
        JOptionPane.showMessageDialog(frame2,ans2);

    }
}
