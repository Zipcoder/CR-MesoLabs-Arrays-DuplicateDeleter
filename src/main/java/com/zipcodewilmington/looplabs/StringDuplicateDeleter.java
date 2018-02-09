package com.zipcodewilmington.looplabs;


import java.util.ArrayList;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] array) {
        super(array);
    }

    @Override
    public String[] removeDuplicates(int minimumOccurrences) {
        return new String[0];
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfOccurrences) {
        return new String[0];
    }
}
