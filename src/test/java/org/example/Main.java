package org.example;

public class Main {

    public static void main(String[] args) {
        // Şimdilik boş kalabilir
    }

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
}


