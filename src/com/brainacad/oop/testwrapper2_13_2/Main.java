package com.brainacad.oop.testwrapper2_13_2;

/**
 * Created by R2-D2 on 13.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Long long1 = compute(Integer.valueOf(5), Double.valueOf(2.5));
        System.out.println(long1);
    }
    private static Long compute(Integer i, Double d){
        return new Long((long)(i+d));
    }
}
