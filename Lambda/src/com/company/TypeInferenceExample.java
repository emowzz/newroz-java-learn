package com.company;

public class TypeInferenceExample {
    public static void main(String[] args) {
//        StringLength myLambda = (String s) -> s.length();
//
//        System.out.println(myLambda.getLength("Hello Lambda"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLength l){
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLength {
        int getLength(String s);
    }
}
