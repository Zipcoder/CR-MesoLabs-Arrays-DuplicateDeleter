package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected final T[] array;
    protected T[] mutArray;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
        this.mutArray = array; // if no changes occur, all is well;
    }

    abstract public T[] removeDuplicates(int minimumOccurrences);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfOccurrences);

    /**
     * get the first index of element if it exists otherwise return -1
     * @param element the element for which to search
     * @return the index of element if present, else -1
     */
    private int getIndexOf(T element) {
        for (int i = 0;i<mutArray.length;i++) {
            if (array[i].equals(element))
                return i;
        }
        return -1;
    }

    /**
     * calculate the number of times the value at [index] occurs in the array
     * @param index the index of the desired value
     * @return number of times value at 'index' occurs in the array
     */
     protected int getTimesOccurred(int index) {
        int c = 0;
        for (int i=0;i<mutArray.length;i++) {
            if (mutArray[i].equals(mutArray[index]))
                c++;
        }
        return c;
    }

    /**
     * remove all occurrences of the thing in the array
     * @param thing the thing of which to remove dupes
     * @return true if things were removed else false
     */
     protected boolean removeDupesByValue(T thing) {
         for (int i=0;i<mutArray.length;i++) {
            if (mutArray[i] == thing)
                removeElementAtIndex(i);
         }
         return true;
     }

    /**
     * remove and return an item from the array at the given index
     * @param index the index of the item to be removed
     * @return the item removed or null if not found
     */
    private T removeElementAtIndex(int index) {
        Object[] result = new Object[mutArray.length - 1];
        System.arraycopy(mutArray, 0, result, 0, index); // copy the objects before the removed item

        if (index < mutArray.length - 1) // if last/only item, don't need a second copy
            System.arraycopy(mutArray, index + 1, result, index, mutArray.length - index - 1); // copy the objects after the removed index

        mutArray = (T[])result; // mutArray now references the data at 'result'

        return array[index]; // just in case
    }

    @Override
    public String toString() {
        return Arrays.toString(mutArray);
    }
}