package com.zipcodewilmington.looplabs;

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


        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {


        return null;
    }

    protected Integer countNumberOfOccurences(Integer[] inputArray, Integer value) {
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }

        }
        return counter;
    }
}

