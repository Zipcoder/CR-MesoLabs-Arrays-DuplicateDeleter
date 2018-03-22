package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    private String[] stringArray = Arrays.copyOf(this.array, this.array.length);
    private DupeChecker dc = new DupeChecker();

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    public String[] removeDuplicates(int n) {
        String nonDupes = "";

        for(String entry : stringArray) {
            int count = dc.getNumberOfOccurrences(stringArray, entry);
            if (count < n) {
                nonDupes += entry + ",";
            }
        }

        return nonDupes.length() > 0 ? nonDupes.split(",") : new String[0];
    }

    public String[] removeDuplicatesExactly(int n) {
        String nonDupes = "";

        for(String entry : stringArray) {
            int count = dc.getNumberOfOccurrences(stringArray, entry);
            if (count != n) {
                nonDupes += entry + ",";
            }
        }

        return nonDupes.length() > 0 ? nonDupes.split(",") : new String[0];
    }
}
