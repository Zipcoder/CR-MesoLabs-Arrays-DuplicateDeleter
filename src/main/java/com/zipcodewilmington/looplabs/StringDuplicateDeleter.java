package com.zipcodewilmington.looplabs;
import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter (String[] stringArray) {
        super(stringArray);
    }

    public String[] removeDuplicates  (int maxNumberOfDuplications){
        String[] outputArray = this.array;
        String [] toDelete = new String[0];
        int deleteCounter =0;
        for(String s  : this.array){
            if (contains(toDelete, s) == true){
                continue;
            }
            else if (containsTimes(this.array, s) >= maxNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = s;
                deleteCounter++;
            }
        }
        for(String s : toDelete){
            outputArray = delete(outputArray, s);
        }

        return outputArray;

    }

    //@Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){
        String[] outputArray = this.array;
        String [] toDelete = new String[0];
        int deleteCounter =0;
        for(String s  : this.array){
            if (contains(toDelete, s) == true){
                continue;
            }
            else if (containsTimes(this.array, s) == exactNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = s;
                deleteCounter++;
            }
        }
        for(String s : toDelete){
            outputArray = delete(outputArray, s);
        }

        return outputArray;
    }

    public static String[] delete(String[] inputArray, String value) {
        String[] workingArray = inputArray;
        String[] outputArray = new String[0];
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

    public static int containsTimes(String[] inputArray, String word) {
        int counter = 0;
        for (String s : inputArray) {
            if (s == word) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean contains(String[] inputArray, String word) {
        for (String s : inputArray) {
            if (s == word) {
                return true;
            }
        }
        return false;
    }



}
