package com.mutexunlocked;

import java.util.*;
public class Main {

    static class MultiThreadDemo extends  Thread{
        public void run(){
            try
            {
                // Displaying the thread that is running
                System.out.println ("Thread " +
                        Thread.currentThread().getId() +
                        " is running");

            }
            catch (Exception e)
            {
                // Throwing an exception
                System.out.println ("Exception is caught");
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            MultiThreadDemo x = new MultiThreadDemo();
            x.start();
        }

        ArrayList<String> mydata = new ArrayList<>();
        mydata.add("applesauce");

        Scanner io = new Scanner(System.in);
        var cool = io.nextInt();
        System.out.println(cool);
    }
}
