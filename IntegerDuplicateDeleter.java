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

        Integer[] removeDuplicate = new Integer[0];
        for (int i = 0; i < this.array.length; i++) {
            if (getNumberOfOccurrences(this.array,this.array[i]) < maxNumberOfDuplications){
                int element = removeDuplicate.length;
                removeDuplicate = Arrays.copyOf(removeDuplicate, removeDuplicate.length +1);
                removeDuplicate[element] = this.array[i];
            }
        }
        return removeDuplicate;

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] removeDuplicate = new Integer[0];
        for (int i =0; i < this.array.length; i++){
            if (getNumberOfOccurrences(this.array,this.array[i]) != exactNumberOfDuplications){
                int element = removeDuplicate.length;
                removeDuplicate = Arrays.copyOf(removeDuplicate, removeDuplicate.length + 1);
                removeDuplicate[element] = this.array[i];
            }
        }
        return removeDuplicate;
    }

    public static int getNumberOfOccurrences(Integer[] array, Integer value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
}
}