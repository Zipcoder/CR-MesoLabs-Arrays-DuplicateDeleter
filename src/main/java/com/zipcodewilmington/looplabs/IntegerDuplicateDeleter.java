package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    private Integer[] intArray = Arrays.copyOf(this.array, this.array.length);
    private DupeChecker dc = new DupeChecker();
    private ArrayBuilder ab = new ArrayBuilder();

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int n) {
        String nonDupes = "";

        for(Integer entry : intArray) {
            int count = dc.getNumberOfOccurrences(intArray, entry);
            if (count < n) {
                nonDupes += entry;
            }
        }

        return ab.buildNewArray(nonDupes);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int n) {
        String nonDupes = "";

        for(Integer entry : intArray) {
            int count = dc.getNumberOfOccurrences(intArray, entry);
            if (count != n) {
                nonDupes += entry;
            }
        }

        return ab.buildNewArray(nonDupes);

    }

    private Integer[] buildNewArray(String s) {
        Integer[] newArray = new Integer[s.length()];

        for(int i = 0; i < newArray.length; ++i)
        {
            newArray[i] = Integer.valueOf(Character.getNumericValue(s.charAt(i)));
        }

        return newArray;
    }

}
