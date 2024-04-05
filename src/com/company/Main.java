package com.company;

public class Main {


    public static void main(String[] args) {
        double a = 1 , b = 10, x = a + (b - a)/2;
        double y = fx(x);

        // без рекурсии
        while (y > 0.001 || y < -0.001){
            if (y > 0.001){
                b = x;
            }else {
                a = x;
            }
            x = a + (b - a)/2;
            y = fx(x);
        }
        System.out.println(x);

        a = 1;
        b = 10;
        // с рекурсией
        System.out.println(recurs(a, b));
    }

    private static double fx(double x) {
        double y = Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
        return y;
    }

    private static double recurs(double a, double b) {
        double x = a + (b - a)/2;

        if (fx(x) > 0.001){
            b = x;
            recurs(a, b);
        }
        if (fx(x) < -0.001){
            a = x;
            recurs(a, b);
        }

        return x;
    }
}
