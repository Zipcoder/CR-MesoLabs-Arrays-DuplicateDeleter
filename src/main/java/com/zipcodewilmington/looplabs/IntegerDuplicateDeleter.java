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


    public static int countDuplicates (Integer[] array, Integer value) {
        int dupeCount = 0;
        for(int i = 0; i < array.length; i++) {
            if(value.equals(array[i])) {
                dupeCount++;
            }
        }
        return dupeCount;
    }

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
                keepInteger
                        .append(keepIt)
                        .append("/");
            }

        }
        if(keepInteger.toString().equals("")) {
            keepInteger.append("/");
        }
        String kept = keepInteger.toString();
        Integer [] arrayReturned = stringToInteger(kept);
        return arrayReturned;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer [] myIntArray = Arrays.copyOf(this.array, this.array.length);
        String keepNumb = "";

        for(Integer it: myIntArray) {
            int x = countDuplicates(myIntArray, it);
            if (x != exactNumberOfDuplications) {
                keepNumb += it + "/";
            }
        }
        if(keepNumb.equals("")) {
            keepNumb = "/";
        }
        String middle = keepNumb.toString();
        Integer[] exactRemoved = stringToInteger(middle);
/*        String[] stringToInt = keepNumb.split("/");
        Integer[] exactIntRemoved = new Integer [stringToInt.length];

        for(int i = 0; i<exactIntRemoved.length; i++) {
            exactIntRemoved[i] = Integer.parseInt(stringToInt[i]);
        }*/

        return exactRemoved;
    }

}
