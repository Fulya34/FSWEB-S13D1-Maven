package org.example;

public class Main {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay >= 20);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19)
                || (b >= 13 && b <= 19)
                || (c >= 13 && c <= 19);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    // ✅ SADECE 1 TANE main
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(5.0));
    }
}