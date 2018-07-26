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

        int deleteCounter = 0;
        for(String x  : this.array){
            if (valueOccurs(toDelete, x) == true){
                continue;
            }
            else if (timesValueOccurs(this.array, x) >= maxNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = x;
                deleteCounter++;
            }
        }
        for(String x : toDelete){
            outputArray = remove(outputArray, x);
        }

        return outputArray;

    }

    //@Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){
        String[] outputArray = this.array;
        String [] toDelete = new String[0];
        int deleteCounter = 0;
        for(String x  : this.array){
            if (valueOccurs(toDelete, x) == true){
                continue;
            }
            else if (timesValueOccurs(this.array, x) == exactNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length + 1);
                toDelete[deleteCounter] = x;
                deleteCounter++;
            }
        }
        for(String s : toDelete){
            outputArray = remove(outputArray, s);
        }

        return outputArray;
    }

    public static String[] remove(String[] inputArray, String value) {
        String[] revisedArray = inputArray;
        String[] outputArray = new String[0];
        int counter = 0;
        for (int i = 0; i < revisedArray.length; i++) {
            if (!revisedArray[i].equals(value)) {
                outputArray = Arrays.copyOf(outputArray, outputArray.length + 1);
                outputArray[counter] = revisedArray[i];
                counter++;
            }
        }
        return outputArray;
    }

    public static int timesValueOccurs(String[] inputArray, String word) {
        int counter = 0;
        for (String x : inputArray) {
            if (x == word) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean valueOccurs(String[] inputArray, String word) {
        for (String x : inputArray) {
            if (x == word) {
                return true;
            }
        }
        return false;
    }
}