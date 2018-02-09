package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected final T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int minimumOccurrences);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfOccurrences);

    /**
     * get the first index of element if it exists otherwise return -1
     * @param element the element for which to search
     * @return the index of element if present, else -1
     */
    private int getIndexOf(T element) {
        return -1;
    }

    /**
     * calculate the number of times the value at [index] occurs in the array
     * @param index the index of the desired value
     * @return number of times value at 'index' occurs in the array
     */
    private int getTimesOccurred(int index) {
        return -1;
    }

    /**
     * remove all occurrences of the value at given index
     * @param index the index of the target value
     * @return true if items were removed else false
     */
    private boolean removeDupesByIndex(int index) {
        return false;
    }

    /**
     * remove all occurrences of the thing in the array
     * @param thing the thing of which to remove dupes
     * @return true if things were removed else false
     */
    private boolean removeAllOccurrencesOf(T thing) {
        return false;
    }

    /**
     * remove and return an item from the array at the given index
     * @param index the index of the item to be removed
     * @return the item removed or null if not found
     */
    private T removeElementAtIndex(int index) {
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}