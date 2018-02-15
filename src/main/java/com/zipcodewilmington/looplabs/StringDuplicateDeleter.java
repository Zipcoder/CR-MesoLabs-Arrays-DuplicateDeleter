package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        String[] removeDupExact = new String[0];
        for (int i =0; i < this.array.length; i++){
            if (getNumberOfOccurrences(this.array,this.array[i]) < maxNumberOfDuplications){
                int element = removeDupExact.length;
                removeDupExact = Arrays.copyOf(removeDupExact,removeDupExact.length +1);
                removeDupExact[element] = this.array[i];
            }

        }

        return removeDupExact;


    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] removeDupExact = new String[0];
        for (int i =0; i < this.array.length; i++){
            if (getNumberOfOccurrences(this.array,this.array[i])!= exactNumberOfDuplications){
                int element = removeDupExact.length;
                removeDupExact = Arrays.copyOf(removeDupExact,removeDupExact.length +1);
                removeDupExact[element] = this.array[i];
            }

        }

        return removeDupExact;
    }
    public int getNumberOfOccurrences (String[]array,String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }
}

