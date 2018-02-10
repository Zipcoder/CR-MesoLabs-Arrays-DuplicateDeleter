package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected final T[] array;
    protected T[] mutArray;

    public DuplicateDeleter(T[] intArray) {
        Arrays.sort(intArray);
        this.array = intArray;
        this.mutArray = array; // if no changes occur, all is well;

    }

    abstract public T[] removeDuplicates(int minimumOccurrences);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfOccurrences);

    /**
     * calculate the number of times the value at [index] occurs in the array
     * @param index the index of the desired value
     * @return number of times value at 'index' occurs in the array
     */
     protected int getTimesOccurred(int index) {
        int c = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i].equals(array[index]))
                c++;
        }
        return c;
    }

    /**
     * remove all occurrences of the thing in the array
     * @param thing the thing of which to remove dupes
     * @return true if things were removed else false
     */
     protected boolean removeDupesByValue(T thing, int timesOccurred) {
         for (int i=0;i<mutArray.length;i++) {
            if (mutArray[i].equals(thing))
                removeDupesBatch(i, timesOccurred);
         }
         return true;
     }

    /**
     *
     * @param startIndex
     * @param timesOccurred
     * @return
     */
     private boolean removeDupesBatch(int startIndex, int timesOccurred) {
         T[] result = Arrays.copyOf(Arrays.copyOfRange(mutArray, 0, startIndex), mutArray.length-timesOccurred);

         System.arraycopy(mutArray, startIndex + timesOccurred, result, startIndex, mutArray.length - startIndex - timesOccurred); // copy the objects after the removed index

         // mutArray now references the data at 'result'
         mutArray = result;
         return true;
     }

    @Override
    public String toString() {
        return Arrays.toString(mutArray);
    }
}