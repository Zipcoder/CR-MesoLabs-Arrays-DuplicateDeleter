package com.zipcodewilmington.looplabs;
import java.util.Arrays;
/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter (Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicates  (int maxNumberOfDuplications){
       // System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(this.array));
        Integer[] test = new Integer[1];
        return test;

    }

    //@Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        System.out.println(Arrays.toString(this.array));
        Integer[] test = new Integer[1];
        return test;
    }

}
