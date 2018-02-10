package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Collection;

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
        for(int i=0;i<array.length;i++) {
            int c = getTimesOccurred(i);
            if (c >= minimumOccurrences)
                removeDupesByValue(array[i], c);
        }
        return this.mutArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfOccurrences) {
        for(int i=0;i<array.length;i++) {
            int c = getTimesOccurred(i);
            if (c == exactNumberOfOccurrences)
                removeDupesByValue(array[i], c);
        }
        return mutArray;
    }
}
