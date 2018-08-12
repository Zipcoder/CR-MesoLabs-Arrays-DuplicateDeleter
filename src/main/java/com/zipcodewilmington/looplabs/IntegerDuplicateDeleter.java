package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    //constructor
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    Integer[] anIntArray = Arrays.copyOf(this.array, this.array.length);

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        int noDuplicates = 0;
        Integer[] duplicates = new Integer[0];
        int duplicatesIndex = 0;
        for (int i = 0; i < anIntArray.length; i++) {
            if (contains(duplicates, anIntArray[i])) {
                continue;
            } else if (getNumberOfOccurrences(anIntArray, anIntArray[i]) >= maxNumberOfDuplications) {
                duplicates = Arrays.copyOf(duplicates, duplicates.length + 1);
                duplicates[duplicatesIndex] = array[i];
                duplicatesIndex++;
            }
        }
        Integer[] checking = Arrays.copyOf(anIntArray, anIntArray.length);
        for (Integer k : duplicates) {
            checking = removeValue(checking, k);

        }
        return checking;
    }


    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int noDuplicates = 0;
        Integer[] duplicates = new Integer[0];
        int duplicatesIndex = 0;
        for (int i = 0; i < anIntArray.length; i++) {
            if (contains(duplicates, anIntArray[i])) {
                continue;
            } else if (getNumberOfOccurrences(anIntArray, anIntArray[i]) == exactNumberOfDuplications) {
                duplicates = Arrays.copyOf(duplicates, duplicates.length + 1);
                duplicates[duplicatesIndex] = array[i];
                duplicatesIndex++;
            }
        }
        Integer[] checking = Arrays.copyOf(anIntArray, anIntArray.length);
        for (Integer k : duplicates) {
            checking = removeValue(checking, k);

        }
        return checking;
    }


    public static int getNumberOfOccurrences(Integer[] array, Integer value) {

        //created a countOccurence holder, to hold value everytime it appears

        int countOccurence = 0;

        for (Integer myValue : array) {
            if (myValue.equals(value))
                countOccurence++;
        }

        return countOccurence;
    }


    public static Integer[] removeValue(Integer[] array, Integer valueToRemove) {

        int newSize = array.length - getNumberOfOccurrences(array, valueToRemove);
        Integer[] outputArray = new Integer[newSize];
        int indexNotDuplicates = 0;

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                outputArray[indexNotDuplicates] = array[i];
                indexNotDuplicates++;
            }
        }
        return outputArray;
    }

    public static boolean contains(Integer[] array, Integer value) {
        /*the enhanced for loop starts at String myValue and searches to the end of array(so at every index comparing
        . Then we add an if statement to see if the beginning of myValue equals value (which is what we are looking
        for). */
        for (Integer myValue : array) {
            if (myValue.equals(value)) {
                return true;
            }
        }
        return false;
    }
}