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

    @java.lang.Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(y -> getOccurance(y)< maxNumberOfDuplications).toArray(Integer[]::new);
    }

    @java.lang.Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(t -> getOccurance(t) != exactNumberOfDuplications).toArray(Integer[]::new);
    }

    public Long getOccurance (Integer x){
        return Arrays.stream(array).filter(z ->z == x).count();
    }
}
