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


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] notYetDel = Arrays.copyOf(array, array.length);
        int count = 0;
        for(int i = 0; i<array.length; i++) {
            int x = countDuplicates(array, array[i]);
            if (x < maxNumberOfDuplications) {
                notYetDel[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOf(notYetDel, count);


    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer [] myIntArray = Arrays.copyOf(this.array, this.array.length);
        int count = 0;
        for(Integer it: array) {
            int x = countDuplicates(array, it);
            if (x != exactNumberOfDuplications) {
                myIntArray[count] = it;
                count++;

            }
        }
        return Arrays.copyOf(myIntArray,count);
    }
}
