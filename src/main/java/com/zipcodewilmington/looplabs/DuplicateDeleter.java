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

    }
