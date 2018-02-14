package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    /**
     * Constructor
     *
     * @param intArray the Array to pass into the duplicate deleter
     */
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    /**
     *
     * @param maxNumberOfDuplications the max number of times that a duplicate will be removed
     * @return String[]
     */
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Set<String> mySet = new HashSet<>(Arrays.asList(this.array));
        ArrayList<String> finalResults = new ArrayList<>();

        int counter;
        for(String i : mySet) {
            counter = 0;
            for (String j : this.array)
                if(j.equals(i))
                    counter++;

            if (counter < maxNumberOfDuplications)
                for (int j = 0; j < counter; j++)
                    finalResults.add(i);
        }

        return finalResults.toArray(new String[finalResults.size()]);
    }

    /**
     *
     * @param exactNumberOfDuplications Exactly the number of duplicates to remove
     * @return String[]
     */
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Set<String> mySet = new HashSet<>(Arrays.asList(this.array));
        ArrayList<String> finalResults = new ArrayList<>();
        int counter;
        for(String i : mySet) {
            counter = 0;
            for (String j : this.array)
                if(j.equals(i))
                    counter++;

            if (counter != exactNumberOfDuplications)
                for (int j = 0; j < counter; j++)
                    finalResults.add(i);
        }

        return finalResults.toArray(new String[finalResults.size()]);
    }

}
