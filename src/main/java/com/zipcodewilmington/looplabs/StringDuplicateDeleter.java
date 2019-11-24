package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] stringArray){
        super(stringArray);
    }

    public Long counter(String index){
        return Arrays.stream(array).filter(j -> j.equals(index)).count();
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplication){
        return Arrays.stream(array).filter(x -> counter(x) < maxNumberOfDuplication).toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){
        return Arrays.stream(array).filter(a -> counter(a) != exactNumberOfDuplications).toArray(String[]::new);
    }


}
