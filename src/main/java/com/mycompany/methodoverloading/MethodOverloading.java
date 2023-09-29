/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodoverloading;

/**
 *
 * @author Hp
 */
public class MethodOverloading {


    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();

        // Adding integers
        int sumInt = calculator.add(5, 10);
        System.out.println("Sum of integers: " + sumInt);

        // Adding doubles
        double sumDouble = calculator.add(2.5, 3.5);
        System.out.println("Sum of doubles: " + sumDouble);

        // Adding three integers
        int sumThreeInt = calculator.add(3, 6, 9);
        System.out.println("Sum of three integers: " + sumThreeInt);
    }
}