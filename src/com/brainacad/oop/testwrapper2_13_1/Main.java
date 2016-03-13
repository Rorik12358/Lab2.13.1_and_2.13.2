package com.brainacad.oop.testwrapper2_13_1;

/**
 * Created by R2-D2 on 13.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = Integer.valueOf(10);
        Integer x3 = Integer.valueOf("10");
        Integer x4 = new Integer(10);
        Integer x5 = Integer.parseInt("10");

        System.out.println(x1 == x2);
        System.out.println(x1.equals(x2));
        System.out.println();

        System.out.println(x1 == x3);
        System.out.println(x1.equals(x3));
        System.out.println();

        System.out.println(x1 == x4);
        System.out.println(x1.equals(x4));
        System.out.println();

        System.out.println(x1 == x5);
        System.out.println(x1.equals(x5));
        System.out.println();


        System.out.println("xx:");
        Integer xx1 = 250;
        Integer xx2 = Integer.valueOf(250);
        Integer xx3 = Integer.valueOf("250");
        Integer xx4 = new Integer(250);
        Integer xx5 = Integer.parseInt("250");

        System.out.println(xx1 == xx2);
        System.out.println(xx1.equals(xx2));
        System.out.println();

        System.out.println(xx1 == xx3);
        System.out.println(xx1.equals(xx3));
        System.out.println();

        System.out.println(xx1 == xx4);
        System.out.println(xx1.equals(xx4));
        System.out.println();

        System.out.println(xx1 == xx5);
        System.out.println(xx1.equals(xx5));
    }
}
