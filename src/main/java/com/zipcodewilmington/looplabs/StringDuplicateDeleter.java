package com.zipcodewilmington.looplabs;

import java.util.ArrayList;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String counter = "";
        String buffArray = "";
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                counter += i;
                if (i == array.length - 2) {
                    counter += (array[i + 1]);
                }
            } else if (!(array[i].equals(array[i + 1]))) {
                if (counter.length() == maxNumberOfDuplications) {
                    counter = "";
                } else if (i >= array.length - 2) {
                    counter += (array[i + 1]);
                }
                for (int j = 0; j < counter.length(); j++) {
                    buffArray += (counter.indexOf(j));
                }
                counter += "";
            }
        }
        String[] revArray = buffArray.split("");
        return revArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String counter = "";
        String buffArray = "";
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                counter += i;
                if (i == array.length - 2) {
                    counter += (array[i + 1]);
                }
            } else if (!(array[i].equals(array[i + 1]))) {
                if (counter.length() == exactNumberOfDuplications) {
                    counter = "";
                } else if (i == array.length - 2) {
                    counter += (array[i + 1]);
                }
                for (int j = 0; j < counter.length(); j++) {
                    buffArray += (counter.indexOf(j));

                }
                counter += "";
            }
        }
        String[] revArray = buffArray.split("");
        return revArray;
    }
}
