package com.company;

public class Utilities {

    // Returns a char array containing every nth char. when
    // sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourcheArray, int n)
    {
        if (sourcheArray == null || sourcheArray.length < n)
        {
            return sourcheArray;
        }

        int returnedLength = sourcheArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i=n-1 ; i<sourcheArray.length ; i+=n)
        {
            result[index++] = sourcheArray[i];
        }

        return result;
    }

    //Removes pairs of the same character that are next
    //to each other, by removing on e occurrebce of the character.
    //"ABBCDEEF" -> "ABCDEF"
    //"ABCBDEEF" -> "ABCBDFF" (the two B's aren't next to each other, so they are
    // aren't removed)
    public String removePairs(String source)
    {
        //if length is less than 2, there won't be any pairs
        if (source == null || source.length() < 2)
        {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();


        for(int i=0 ; i<string.length - 1 ; i++)
        {
            System.out.println(string[i]);
            if (string[i] != string[i+1])
            {
                sb.append(string[i]);
            }
        }

        System.out.println(string[string.length -1]);
        //Add the final character. which is always safe
        sb.append(string[string.length - 1]);
        return sb.toString();
    }

    //perform a conversion based on some
    public int converter(int a , int b)
    {
        return (a/b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source)
    {
        if (source.length() % 2 == 0)
        {
            return source;
        }
        return null;
    }


}
