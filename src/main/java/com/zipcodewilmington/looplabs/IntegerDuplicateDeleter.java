package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) < maxNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
    }

    public long getNumberOfOccurrances(Integer element) {
        return (Arrays.stream(array)
                .filter(num -> num == element)
                .count());
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) != exactNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
    }
}
