package com.company;

public class Main {

    public static void main(String[] args) {

//        int value = 12;
//        if (value == 1) {
//            System.out.println("value was 1");
//        }
//        else if (value == 2) {
//            System.out.println("value was 2");
//        }
//        else {
//            System.out.println("was not 1 or 2");
//        }

        //switch is useful when you are using same variable to change different values

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                System.out.println("Actually it was a "+switchValue);
                break;

            default:
                System.out.println("was not 1 or 2");
                break;
        }

        char charSwtichValue = 'A';

        switch (charSwtichValue) {
            case 'A':
                System.out.println("It was 'A'");
                break;
            case 'B':
                System.out.println("It was 'B'");
                break;
            case 'C':
                System.out.println("It was 'C'");
                break;
            case 'D':
                System.out.println("It was 'D'");
                break;
            case 'E':
                System.out.println("It was 'E'");
                break;
            default:
                System.out.println("It was not A, B, C, D or E");
                System.out.println("It was "+charSwtichValue);
                break;

        }

        String month = "januarY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Neither Jan nor June");
                break;
        }



    }
}
