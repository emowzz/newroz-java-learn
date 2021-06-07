package com.company;

public class Main {

    public static void main(String[] args) {
        //float occupies 32 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMinFloatValue);
        System.out.println("Float maximum value = "+myMaxFloatValue);

        //double occupies 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "+myMinDoubleValue);
        System.out.println("Double maximum value = "+myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue " + myIntValue);
        System.out.println("MyFloatValue " + myFloatValue);
        System.out.println("MyDoubleValue " + myDoubleValue);

        double actualPound = 1d;
        double poundToKilogram = actualPound * 0.45359237d;
        System.out.println("Pound to Kilogram : "+poundToKilogram);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        //double is the recommendation to use
    }
}
