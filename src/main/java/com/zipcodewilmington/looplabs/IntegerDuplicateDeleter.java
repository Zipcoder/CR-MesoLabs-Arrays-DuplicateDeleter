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

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] outputArray = this.array;
        Integer[] toDelete = new Integer[0];

        int deleteCounter = 0;
        for (Integer x : this.array) {
            if (valueOccurs(toDelete, x) == true) {
                continue;

            } else if (timesValueOccurs(this.array, x) >= maxNumberOfDuplications) {
                toDelete = Arrays.copyOf(toDelete, toDelete.length + 1);
                toDelete[deleteCounter] = x;
                deleteCounter++;
            }

            for (Integer y : toDelete) {
                outputArray = remove(outputArray, y);
            }
        }
        System.out.println(outputArray);
        return outputArray;
    }

    //@Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] outputArray = this.array;
        Integer[] toDelete = new Integer[0];
        int deleteCounter = 0;
        for (Integer i : this.array) {
            if (valueOccurs(toDelete, i) == true) {
                continue;
            } else if (timesValueOccurs(this.array, i) == exactNumberOfDuplications) {
                toDelete = Arrays.copyOf(toDelete, toDelete.length + 1);
                toDelete[deleteCounter] = i;
                deleteCounter++;
            }
        }
        for (Integer i : toDelete) {
            outputArray = remove(outputArray, i);
        }

        return outputArray;
    }


    public static Integer[] remove(Integer[] inputArray, int value) {
        Integer[] revisedArray = inputArray;
        Integer[] outputArray = new Integer[0];
        int counter = 0;
        for (int i = 0; i < revisedArray.length; i++) {
            if (!revisedArray[i].equals(value)) {
                outputArray = Arrays.copyOf(outputArray, outputArray.length + 1);
                outputArray[counter] = revisedArray[i];
                counter++;
            }
        }
        return outputArray;
    }

    public static int timesValueOccurs(Integer[] inputArray, int value) {
        int counter = 0;
        for (Integer i : inputArray) {
            if (i == value) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean valueOccurs(Integer[] inputArray, int value) {
        for (Integer i : inputArray) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

}
