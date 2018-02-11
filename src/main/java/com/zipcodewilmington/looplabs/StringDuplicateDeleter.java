package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        boolean checking = true;
        String currentString = "";
        int count = 0;
        int currentIndex = 0;
        StringBuilder dupString = new StringBuilder();

        Arrays.sort(array);
        if (maxNumberOfDuplications < 2) {
            return new String[0];
        } else {
            while (checking) {
                currentString = array[currentIndex];
                count = Utils.countMatches(currentIndex, count, array, currentString);
                Utils.appender(maxNumberOfDuplications, dupString, currentString, count);

                if (Utils.isComplete(currentIndex, count, array)) {
                    checking = false;
                } else {
                    currentIndex += count;
                    count = 0;
                }
            }
            String[] dupArray = dupString.toString().split(",");
            return dupArray;
        }
    }


    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        boolean checking = true;
        String currentString = "";
        int count = 0;
        int currentIndex = 0;
        StringBuilder dupString = new StringBuilder();

        Arrays.sort(array);
        while(checking) {
            currentString = array[currentIndex];
            count = Utils.countMatches(currentIndex, count, array, currentString);
            Utils.appendExact(exactNumberOfDuplications, dupString, currentString, count);

            if (Utils.isComplete(currentIndex, count, array)) {
                checking = false;
            } else {
                currentIndex += count;
                count = 0;
            }
        }
    String[] dupArray = dupString.toString().split(",");
    return dupArray;
    }
}