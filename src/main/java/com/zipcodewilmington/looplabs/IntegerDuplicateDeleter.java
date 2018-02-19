package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    Integer[] myCopyOfArray = Arrays.copyOf(this.array, this.array.length);

    /**
     *
     * @param maxNumberOfDuplications
     * @return returns an array with integers occuring less than the maxNumberOfDuplications
     */
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] outPut = new Integer[0];
        int outPutIndex = 0;
        for (int s : myCopyOfArray) {

            if (getNumberOfOccurrences(myCopyOfArray, s) < maxNumberOfDuplications) {
                outPut = Arrays.copyOf(outPut, outPut.length + 1);
                outPut[outPutIndex] = s;
                outPutIndex++;
            }
        }
        return outPut;
    }

    /**
     *
     * @param exactNumberOfDuplications
     * @return returns an array of Integers not the exactNumberOfDuplications
     */

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] outPut = new Integer[0];
        int outPutIndex = 0;
        for (int s : myCopyOfArray) {

            if (getNumberOfOccurrences(myCopyOfArray, s) != exactNumberOfDuplications) {
                outPut = Arrays.copyOf(outPut, outPut.length + 1);
                outPut[outPutIndex] = s;
                outPutIndex++;
            }
        }

        return outPut;
    }

    /**
     *
     * @param array an array of Integers
     * @param value  the value to which the number of occurence in the array is to be determined
     * @return the number of times a value occurs in the array
     */
    public static int getNumberOfOccurrences(Integer[] array, Integer value) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
        }
        return counter;
    }

}