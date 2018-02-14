package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    /**
     * Constructor
     *
     * @param intArray the Array to pass into the duplicate deleter
     */
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    /**
     *
     * @param maxNumberOfDuplications the max number of times that a duplicate will be removed
     * @return Integer[]
     */
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Set<Integer> mySet = new HashSet<>(Arrays.asList(this.array));
        ArrayList<Integer> finalResults = new ArrayList<>();
        int counter;
        for(int i : mySet) {
            counter = 0;
            for (int j : this.array)
                if(j == i)
                    counter++;

            if (counter < maxNumberOfDuplications)
                for (int j = 0; j < counter; j++)
                    finalResults.add(i);
        }

        return finalResults.toArray(new Integer[finalResults.size()]);
    }

    /**
     *
     * @param exactNumberOfDuplications Exactly the number of duplicates to remove
     * @return Integer[]
     */
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Set<Integer> mySet = new HashSet<>(Arrays.asList(this.array));
        ArrayList<Integer> finalResults = new ArrayList<>();
        int counter;
        for(int i : mySet) {
            counter = 0;
            for (int j : this.array)
                if(j == i)
                    counter++;

            if (counter != exactNumberOfDuplications)
                for (int j = 0; j < counter; j++)
                    finalResults.add(i);
        }

        return finalResults.toArray(new Integer[finalResults.size()]);
    }
}
