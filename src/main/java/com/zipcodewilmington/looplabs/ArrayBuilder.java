package com.zipcodewilmington.looplabs;

public class ArrayBuilder {
    public static Integer[] buildNewArray(String s) {
        Integer[] newArray = new Integer[s.length()];

        for(int i = 0; i < newArray.length; ++i)
        {
            newArray[i] = Integer.valueOf(Character.getNumericValue(s.charAt(i)));
        }

        return newArray;
    }
}
