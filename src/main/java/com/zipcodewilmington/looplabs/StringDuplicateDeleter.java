package com.zipcodewilmington.looplabs;

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
        this.mutArray = array;
        for(int i=0;i<array.length;i++) {
            int c = getTimesOccurred(i);
            if (c >= minimumOccurrences)
                removeDupesByValue(array[i], c);
        }
        return this.mutArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfOccurrences) {
        this.mutArray = array;
        for(int i=0;i<array.length;i++) {
            int c = getTimesOccurred(i);
            if (c == exactNumberOfOccurrences)
                removeDupesByValue(array[i], c);
        }
        return mutArray;
    }
}
