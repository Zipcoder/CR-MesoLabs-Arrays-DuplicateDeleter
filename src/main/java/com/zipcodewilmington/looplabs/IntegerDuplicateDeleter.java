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
        Integer[] outputArray = new Integer[0];
        Integer [] toDelete = new Integer[0];
        for(Integer i  : this.array){
            if (containsTimes(this.array, i) >= maxNumberOfDuplications){

            }
        }

        return outputArray;

    }

    //@Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        //System.out.println(Arrays.toString(this.array));
        Integer[] test = new Integer[1];
        return test;
    }

     //test main
    public static void main(String[] args) {
        Integer [] tester = {0,1,2,3,4,5,1};
        System.out.println(containsTimes(tester, 1));
        tester = delete(tester, 1);
        System.out.println(Arrays.toString(tester));
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

