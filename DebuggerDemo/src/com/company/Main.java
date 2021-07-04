package com.company;

public class Main {

    public static void main(String[] args) {

        StringUtilities utilities = new StringUtilities();

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        while(sb.length() < 10)
        {
//            System.out.println(sb.length());
            utilities.addChar(sb, 'a');
        }
        System.out.println(sb);

        String str = "abcdefg";
        String result = utilities.upperAndPrefix(str);
    }
}
