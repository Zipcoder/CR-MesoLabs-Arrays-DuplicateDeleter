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

    public Long counter(Integer index){
        return Arrays.stream(array).filter(j -> j == index).count();
    }

    @Override
    public Integer[] removeDuplicates (int maxNumberOfDuplications){
        return Arrays.stream(array).filter(x -> counter(x) < maxNumberOfDuplications).toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        return Arrays.stream(array).filter(a -> counter(a) != exactNumberOfDuplications).toArray(Integer[]::new);
    }




}
