package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    //constructor
    public IntegerDuplicateDeleter (Integer[] intArray) {
        super(intArray);
    }

    //count the number of times that a number is present
    public static int countDuplicates (Integer[] array, Integer value) {
        int count = 0;
        for (Integer item : array) {
            if (value.equals(item)) count++;
        }
        return count;
    }

    //turn the string into an Integer array
    public Integer[] stringToInteger(String keepNumb) {
        String[] stringToInt = keepNumb.split("/");
        Integer[] exactIntRemoved = new Integer [stringToInt.length];
        for(int i = 0; i<stringToInt.length; i++) {
            exactIntRemoved[i] = Integer.parseInt(stringToInt[i]);
        }
        return exactIntRemoved;
    }


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] notYetDel = Arrays.copyOf(this.array, this.array.length);
        StringBuilder keepInteger = new StringBuilder();

        for(Integer keepIt: notYetDel) {
            int x = countDuplicates(notYetDel, keepIt);
            if (x < maxNumberOfDuplications) {
                keepInteger.append(keepIt)
                           .append("/");
            }
        }
        if(keepInteger.toString().equals("")) keepInteger.append("/");
        String kept = keepInteger.toString();
        return stringToInteger(kept);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer [] myIntArray = Arrays.copyOf(this.array, this.array.length);
        StringBuilder keepNumb = new StringBuilder();

        for(Integer it: myIntArray) {
            int x = countDuplicates(myIntArray, it);
            if (x != exactNumberOfDuplications) {
                keepNumb.append(it)
                        .append("/");
            }
        }
        if(keepNumb.toString().equals("")) keepNumb.append("/");
        String middle = keepNumb.toString();
        return stringToInteger(middle);
    }
}
