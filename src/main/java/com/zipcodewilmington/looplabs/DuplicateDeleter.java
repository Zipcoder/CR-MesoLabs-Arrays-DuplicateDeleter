package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected final T[] array;

    public DuplicateDeleter(T[] newArray) {
        this.array = newArray;
    }

     public T[] removeDuplicates(int maxNumberOfDuplications) {

        return null;

    }


    public T[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return null;
    }


    /**
     * @param array array of num objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO needs to be generic
    public int getNumberOfOccurrences(Integer[] array, Integer value) {

        int numOfOccurrences = 0;
        for (int i = 0; i < array.length; i++) {

            if (value.equals(array[i])) {
                numOfOccurrences++;
            }
        }
        return numOfOccurrences;
    }


    /**
     * @param array         array of num objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO needs to be generic
    public Integer[] removeValue(Integer[] array, Integer valueToRemove) {

        int count = getNumberOfOccurrences(array, valueToRemove);
        Integer[] newArray = new Integer[array.length - count];

        int indx = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray[indx] = array[i];
                indx++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (value.equals(array[i])) {
                counter++;
            }
        }
        return counter;
    }



    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO needs to be generic
    public static String[] removeValue(String[] array, String valueToRemove) {

        int count = getNumberOfOccurrences(array, valueToRemove);
        String[] newArray = new String[array.length - count];

        int indx = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray[indx] = array[i];
                indx++;
            }
        }

        return newArray;
    }




}