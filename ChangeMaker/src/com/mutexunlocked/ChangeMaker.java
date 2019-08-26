/*
 * Created by Friedrich Doku
 * Fritz
 */

package com.mutexunlocked;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChangeMaker {

    public static Map<Double,String> hm;
    public static void main(String[] args) {
	// write your code here
        hm = new HashMap<Double,String>();
        hm.put(new Double(20),"$20 bills: ");
        hm.put(new Double(5),"$5 bills: ");
        hm.put(new Double(1),"$1 bills: ");
        hm.put(new Double(0.25),"Quarters: ");
        hm.put(new Double(0.10),"Dimes: ");
        hm.put(new Double(0.05),"Nickels:  ");
        hm.put(new Double(0.01),"Pennies:  ");

        double cashregister[] = {20,5,1,0.25,0.10,0.05,0.01};
        double money, tendered;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total Bill? $");
        money = scanner.nextDouble();
        System.out.print("Amount Tendered? $");
        tendered = scanner.nextDouble();
        getchange((tendered - money), cashregister);
    }

    public static void getchange(double amount, double[] cashreg){
        if(amount < 0){ System.out.println("Not enough money"); }
        else {
            for (double x : cashreg) {
                int tmp = (int) (amount / x);
                amount = amount % x;
                System.out.println(hm.get(x) + Integer.toString(tmp));
            }
        }
    }
}
