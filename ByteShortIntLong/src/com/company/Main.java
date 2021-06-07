package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        //int occupies 32 bits
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //MaxValue goes overflow
        System.out.println("Busted MAX Value = "+ (myMaxIntValue + 1));
        //MinValue goes underflow
        System.out.println("Busted MIN Value = "+ (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        //byte occupies 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+ myMinByteValue);
        System.out.println("Byte Maximum Value = "+ myMaxByteValue);

        //short occupies 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+ myMinShortValue);
        System.out.println("Short Maximum Value = "+ myMaxShortValue);

        //long occupies 64 bits
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = "+ myMinLongValue);
        System.out.println("Long Maximum Value = "+ myMaxLongValue);
        //any number greater than 32 can be done through L at the end
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //() -> paranthasis makes it int so we will have to change it into byte type
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        //() -> paranthasis makes it int so we will have to change it into short type
        short myNewShortValue = (short)(myMinShortValue / 2);


    }
}
