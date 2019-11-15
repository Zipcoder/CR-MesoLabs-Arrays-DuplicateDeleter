package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer num : array) {
            if (getNumberOfOccurrances(num) < maxNumberOfDuplications) {
                newList.add(num);
            }
        }
        return newList.toArray(new Integer[0]);
    }

    public Integer getNumberOfOccurrances(Integer element) {
        Integer count = 0;
        for (Integer num : array) {
            if (num.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer num : array) {
            if (getNumberOfOccurrances(num) != exactNumberOfDuplications) {
                newList.add(num);
            }
        }
        return newList.toArray(new Integer[0]);
    }
}
