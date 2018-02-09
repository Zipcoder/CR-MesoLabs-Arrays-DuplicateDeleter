package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 * bummer
 */
public interface DuplicateDeleterInterface<T> {
    T[] removeDuplicates(int minimumOccurrences);
    T[] removeDuplicatesExactly(int exactNumberOfOccurrences);
}