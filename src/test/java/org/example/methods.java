package org.example;
public class barking {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false; // Geçersiz saat aralığı
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 20)) {
            return true; // Gece 8'den sonra ya da sabah 8'den önce havlıyorsa uyan
        }

        return false; // Diğer durumlarda uyanma
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));   // true
        System.out.println(shouldWakeUp(false, 2));  // false
        System.out.println(shouldWakeUp(true, 8));   // false
        System.out.println(shouldWakeUp(true, -1));  // false
    }
}
// 2. Yas Tespiti

public class TeenChecker {

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (isTeen(age1) || isTeen(age2) || isTeen(age3));
    }

    // Yardımcı metod
    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));   // true
        System.out.println(hasTeen(23, 15, 42));  // true
        System.out.println(hasTeen(22, 23, 34));  // false
    }
}

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));   // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true
    }
}


public class AreaCalculator {

    // Dikdörtgenin alanı
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1; // Geçersiz değer
        }
        return width * height;
    }

    // Dairenin alanı
    public static double area(double radius) {
        if (radius < 0) {
            return -1; // Geçersiz değer
        }
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(area(5.0, 4.0)); // 20.0
        System.out.println(area(-1.0, 4.0)); // -1
        System.out.println(area(5.0)); // 78.53981633974483
        System.out.println(area(-1.0)); // -1
    }
}
