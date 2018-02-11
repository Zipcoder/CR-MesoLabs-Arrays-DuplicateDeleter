package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected final T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    protected static int getNumberOfOccurrences(String[] array, String value) {

        int valOccurs = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                valOccurs++;
            }
        }
        return valOccurs;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    protected static String[] removeValue(T array, String valueToRemove) {

        int newArraySize = array.length - getNumberOfOccurrences(array, valueToRemove);
        String[] resultArray = new String[newArraySize];
        int shift = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(valueToRemove)) {
                shift++;
            } else {
                resultArray[i - shift] = array[i];
            }
        }
        return resultArray;
    }
}