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
        Integer[] outputArray = this.array;
        Integer [] toDelete = new Integer[0];
        int deleteCounter =0;
        for(Integer i  : this.array){
            if (contains(toDelete, i) == true){
                continue;
            }
            else if (containsTimes(this.array, i) >= maxNumberOfDuplications){
            toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
            toDelete[deleteCounter] = i;
            deleteCounter++;
            }
        }
        for(Integer i : toDelete){
            outputArray = delete(outputArray, i);
        }

        return outputArray;

    }

    //@Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        Integer[] outputArray = this.array;
        Integer [] toDelete = new Integer[0];
        int deleteCounter =0;
        for(Integer i  : this.array){
            if (contains(toDelete, i) == true){
                continue;
            }
            else if (containsTimes(this.array, i) == exactNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = i;
                deleteCounter++;
            }
        }
        for(Integer i : toDelete){
            outputArray = delete(outputArray, i);
        }

        return outputArray;
    }


    public static Integer[] delete(Integer[] inputArray, int value) {
        Integer[] workingArray = inputArray;
        Integer[] outputArray = new Integer[0];
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (!workingArray[i].equals(value)) {
                outputArray = Arrays.copyOf(outputArray, outputArray.length + 1);
                outputArray[counter] = workingArray[i];
                counter++;
            }
        }
        return outputArray;
    }

    public static int containsTimes(Integer[] inputArray, int value) {
        int counter = 0;
        for (Integer i : inputArray) {
            if (i == value) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean contains(Integer[] inputArray, int value) {
        for (Integer i : inputArray) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

}

