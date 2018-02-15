package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] removeDupExact = new Integer[0];
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
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] removeDupExact = new Integer[0];
        for (int i =0; i < this.array.length; i++){
            if (getNumberOfOccurrences(this.array,this.array[i])!= exactNumberOfDuplications){
                int element = removeDupExact.length;
                removeDupExact = Arrays.copyOf(removeDupExact,removeDupExact.length +1);
                removeDupExact[element] = this.array[i];
            }

        }

        return removeDupExact;


    }
    public int getNumberOfOccurrences (Integer[]array,Integer value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

}
