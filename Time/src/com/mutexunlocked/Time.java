package com.mutexunlocked;

/**
 * Created by Friedich Doku
 * Date: changeme
 */

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        // write your code here
        Scanner io = new Scanner(System.in);
        System.out.print("Hours: ");
        int hours = io.nextInt();
        System.out.print("Minutes: ");
        int min = io.nextInt();
        System.out.print("Seconds: ");
        int sec = io.nextInt();

        int ans = (60 * 60 * hours) + (60 * min) + sec;
        String result = String.valueOf(hours) + " hour(s), " + String.valueOf(min) +
                " minute(s) and " + String.valueOf(sec)+ " second(s) \n" +
                "is equivalent to " + String.valueOf(ans) + " seconds.\n";
        System.out.print(result);
    }
}
