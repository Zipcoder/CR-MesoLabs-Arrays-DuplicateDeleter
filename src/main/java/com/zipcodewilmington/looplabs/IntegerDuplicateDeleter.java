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
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] finalArray = new Integer[0];

        for (int i = 0; i < this.array.length; i++) {

            if (getNumberOfOccurrences(this.array, this.array[i]) != exactNumberOfDuplications) {

                int actualElements = finalArray.length;
                finalArray = Arrays.copyOf(finalArray, finalArray.length + 1);
                finalArray[actualElements] = this.array[i];

            }

        }

        return finalArray;
    }

    public static int getNumberOfOccurrences(Integer[] inputArray, Integer value) {

        int valueCounter = 0;

        for (int arrayElement : inputArray) {

            if (arrayElement == value) {

                valueCounter++;
            }

        }

        return valueCounter;
    }


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] actualArray = new Integer[0];

        for (int i = 0; i < this.array.length; i++) {

            if (getNumberOfOccurrences(this.array, this.array[i]) < maxNumberOfDuplications) {

                int arrayElements = actualArray.length;
                actualArray = Arrays.copyOf(actualArray, actualArray.length + 1);
                actualArray[arrayElements] = this.array[i];

            }

        }

        return actualArray;

    }

}


