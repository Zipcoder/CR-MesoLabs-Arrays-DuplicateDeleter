package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

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
        return Arrays.stream(array).filter(y -> getOccurence(y) <  maxNumberOfDuplications).toArray(Integer [] :: new);  //last part creates a new array.  lambda kind of like for : each
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(t -> getOccurence(t) != exactNumberOfDuplications).toArray((Integer [] :: new));
    }

    //Method we created to find the number of occurences of a particular integer in the stream.
    public Long getOccurence (Integer x) {
        return Arrays.stream(array).filter(z -> z==x).count();
    }
}
