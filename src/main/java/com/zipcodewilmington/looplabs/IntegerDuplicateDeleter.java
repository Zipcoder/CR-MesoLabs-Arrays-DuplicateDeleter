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

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] resultArray = new Integer[0];
        for (int i = 0; i < this.array.length; i++) {
            if (getNumberOfOccurrences(this.array, this.array[i]) >= maxNumberOfDuplications) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
            }
        }

        return resultArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] resultArray = new Integer[0];
        for (int i = 0; i < this.array.length; i++) {
            if (getNumberOfOccurrences(this.array, this.array[i]) >= exactNumberOfDuplications) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
            }
        }

        return resultArray;
    }


}

