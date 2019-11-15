package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    public long getNumberOfOccurrances(String element) {
        return (Arrays.stream(array)
                .filter(word -> word.equals(element))
                .count());
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) < maxNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(element -> getNumberOfOccurrances(element) != exactNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }
}
