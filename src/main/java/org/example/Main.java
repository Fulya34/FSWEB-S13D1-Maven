package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if ( clock < 0 ||  clock > 23) {
            return false;
    }
        if (isBarking &&(clock >= 20 || clock < 8)){
            return true;
        }
        return false;{

        }
        public static  void (String[] args) {
            System.out.println(shouldWakeUp(true,21));
            System.out.println(shouldWakeUp(true, 10));
            System.out.println(shouldWakeUp(false, 23));
            System.out.println(shouldWakeUp(true, 25));
        }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
            if ((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19))
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(hasTeen(12, 20, 15));
        System.out.println(hasTeen(10, 22, 5));
        System.out.println(hasTeen(13, 2, 30, 17));
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}
