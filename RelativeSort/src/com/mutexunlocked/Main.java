package com.mutexunlocked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        System.out.println("RUNNING");
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 =  new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            a1.add(arr1[i]);
        }
        for(int i = 0; i < 10; i++){
            a2.add(arr2[i]);
        }


        Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();
        // a2, freq

        for(int i = 0; i < a1.size(); i++){
            for(int j = 0; j < a2.size(); j++){
                if(a1.get(0) == a2.get(0)){
                    System.out.println("YES");
                    Integer x = a2.get(i);
                    Integer freq = 1;
                    try {
                        freq = mymap.get(x);
                        freq++;
                        System.out.println(x);
                        mymap.put(x,freq);
//                        System.out.println(freq);
                    }catch (Exception e) {
                        System.out.println(x);
                        mymap.put(x,freq);
                        continue;
                    }
                }
            }
        }
        for(int i = 0; i < a2.size(); i++){
            int e = mymap.get(a2.get(i));
            //System.out.println(e);
            for(int j = 0; j < e; j++){
                res.add(a2.get(i));
                a1.remove(a1.indexOf(a2.get(i)));
            }
        }
        Collections.sort(a1);
        res.addAll(a1);

        int[] ret = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ret[i] = res.get(i);
        }
        return ret;
    }
    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {943,790,427,722,860,550,225,846,715,320};
        int[] arr2 = {943,715,427,790,860,722,225,320,846,550};

        int[] x = relativeSortArray(arr1, arr2);
        //System.out.println(x[0]);
    }
}
