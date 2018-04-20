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

    /**
     * @param maxNumberOfDuplications
     * @return this.array without duplicated that are equal to or greater than maxNumberOfDuplications
     */

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        //rest of methods are built the same way

        //init revised array
        Integer[] revArray = new Integer[0];

        //for loop to fill array
        for (int i = 0; i < this.array.length; i++) {
            //if the recorded int doesn't meet the restrictions imposed, don't record it
            if (numberOfOccurrences(this.array, this.array[i]) < maxNumberOfDuplications) {
                //counter for the index of the new array being observed
                int currentIndex = revArray.length;
                //copy of method to adjust the size
                revArray = Arrays.copyOf(revArray, currentIndex + 1);
                //fill the array
                revArray[currentIndex] = this.array[i];
            }
        }
        return revArray;
    }


    /**
     * @param exactNumberOfDuplications
     * @return this.array without duplicated that are equal to exactNumberOfDuplications
     */

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] revArray = new Integer[0];
        for (int i = 0; i < this.array.length; i++) {
            if (numberOfOccurrences(this.array, this.array[i]) != exactNumberOfDuplications) {
                int currentIndex = revArray.length;
                revArray = Arrays.copyOf(revArray, currentIndex + 1);
                revArray[currentIndex] = this.array[i];
            }
        }
        return revArray;
    }

    /**
     * @param arrayIn     is the master array of values to be assessed
     * @param targetValue is the integer being looked for
     * @return the amount of times the target value shows up in this.array
     */

    public int numberOfOccurrences(Integer[] arrayIn, Integer targetValue) {
        int occurCounter = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i].equals(targetValue)) {
                occurCounter++;
            }
        }
        return occurCounter;
    }

}