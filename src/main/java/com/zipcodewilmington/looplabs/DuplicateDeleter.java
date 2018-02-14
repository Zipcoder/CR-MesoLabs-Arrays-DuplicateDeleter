package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected final T[] array;

    /**
     * Constructor
     * @param intArray the Array to pass into the duplicate deleter
     */
    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    /**
     * Remove Duplicates
     * Removes duplicates up to maxNumberOfDuplications times
     *
     * @param maxNumberOfDuplications the max number of times that a duplicate will be removed
     * @return int
     */
    abstract public T[] removeDuplicates(int maxNumberOfDuplications);

    /**
     * Remove Duplicates Exactly
     *
     * @param exactNumberOfDuplications Exactly the number of duplicates to remove
     * @return
     */
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}