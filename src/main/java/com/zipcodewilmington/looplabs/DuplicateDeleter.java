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

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);

    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    protected  T[] delete(T[] originalArray, T[] blankArray, T value) {
        T[] workingArray = originalArray;
        //blankArray is a workaround to basically create a new T[0], which Java won't let me do.
        T[] deletedArray = blankArray;
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (!workingArray[i].equals(value)) {
                deletedArray = Arrays.copyOf(deletedArray, deletedArray.length + 1);
                deletedArray[counter] = workingArray[i];
                counter++;
            }
        }
        return deletedArray;
    }

    protected  int containsTimes(T[] inputArray, T value) {
        int counter = 0;
        for (T i : inputArray) {
            if (i == value) {
                counter++;
            }
        }
        return counter;
    }
}