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

        Integer[] finalIntArray = this.array;
        Integer[] toDelete = new Integer[0];
        Integer[] blankArray = new Integer[0];
        int deleteCounter =0;
        for(Integer i  : this.array){
            if (containsTimes(this.array, i) >= maxNumberOfDuplications){
            toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
            toDelete[deleteCounter] = i;
            deleteCounter++;
            }
        }
        for(Integer i : toDelete){
            finalIntArray = delete(finalIntArray, blankArray,  i);
        }
        return finalIntArray;
    }


    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        Integer[] finalIntArray = this.array;
        Integer[] toDelete = new Integer[0];
        Integer[] blankArray = new Integer[0];
        int deleteCounter =0;
        for(Integer i  : this.array){
            if (containsTimes(this.array, i) == exactNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = i;
                deleteCounter++;
            }
        }
        for(Integer i : toDelete){
            finalIntArray = delete(finalIntArray, blankArray,  i);
        }
        return finalIntArray;
    }
}

