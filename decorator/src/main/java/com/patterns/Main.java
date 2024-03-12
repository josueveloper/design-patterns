package com.patterns;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Espresso();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());

        // coffee = new Mocha(coffee);
        // System.out.println(coffee.getDescription());
        // System.out.println(coffee.cost());

        // coffee = new Soy(coffee);
        // System.out.println(coffee.getDescription());
        // System.out.println(coffee.cost());

        // coffee = new Soy(coffee);
        // coffee = new Soy(coffee);
        // coffee = new Soy(coffee);

        // System.out.println(coffee.getDescription());
        // System.out.println(coffee.cost());

        // int c;

        // try {

        // InputStream in = new BufferedInputStream(new
        // FileInputStream("src\\main\\resources\\test.txt"));

        // in = new LowerCaseInputStream(in);

        // while ((c = in.read()) >= 0) {
        // System.out.print((char) c);
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
    }
}