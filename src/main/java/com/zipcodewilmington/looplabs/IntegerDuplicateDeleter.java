package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] array) {
        super(array);
    }

    //TODO: this can be better. make it work first.

    @Override
    public Integer[] removeDuplicates(int minimumOccurrences) {
        for(int i=0;i<mutArray.length;i++) {
            int c = getTimesOccurred(i);
            if (c >= minimumOccurrences)
                removeDupesByValue(mutArray[i]);
        }
        return mutArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfOccurrences) {
        for(int i=0;i<mutArray.length;i++) {
            int c = getTimesOccurred(i);
            if (c == exactNumberOfOccurrences)
                removeDupesByValue(mutArray[i]);
        }
        return mutArray;
    }
}
