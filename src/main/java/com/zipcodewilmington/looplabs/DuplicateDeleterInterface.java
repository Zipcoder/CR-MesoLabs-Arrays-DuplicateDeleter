package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public interface DuplicateDeleterInterface<T> {
    /**
     * Remove Duplicates
     * Removes duplicates up to maxNumberOfDuplications times
     *
     * @param maxNumberOfDuplications the max number of times that a duplicate will be removed
     * @return int
     */
    T[] removeDuplicates(int maxNumberOfDuplications);

    /**
     * Remove Duplicates Exactly
     *
     * @param exactNumberOfDuplications Exactly the number of duplicates to remove
     * @return
     */
    T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}