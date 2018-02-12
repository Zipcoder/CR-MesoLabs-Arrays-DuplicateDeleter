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

    @Override
    public  String[] removeDuplicates  (int maxNumberOfDuplications){
        String[] finalStringArray = this.array;
        String[] toDelete = new String[0];
        int deleteCounter =0;
        for(String s  : this.array){
            if (inArray(toDelete, s)){
                continue;
            }
            else if (frequency(this.array, s) >= maxNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = s;
                deleteCounter++;
            }
        }
        for(String s : toDelete){
            finalStringArray = delete(finalStringArray, s);
        }
        return finalStringArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){
        String[] finalStringArray = this.array;
        String[] toDelete = new String[0];
        int deleteCounter =0;
        for(String s  : this.array){
            if (inArray(toDelete, s)){
                continue;
            }
            else if (frequency(this.array, s) == exactNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = s;
                deleteCounter++;
            }
        }
        for(String s : toDelete){
            finalStringArray = delete(finalStringArray, s);
        }
        return finalStringArray;
    }


    private static String[] delete(String[] originalArray, String value) {
        String[] deletedArray = new String[0];
        int counter = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (!originalArray[i].equals(value)) {
                deletedArray = Arrays.copyOf(deletedArray, deletedArray.length + 1);
                deletedArray[counter] = originalArray[i];
                counter++;
            }
        }
        return deletedArray;
    }

    private static  int frequency(String[] inputArray, String value) {
        int counter = 0;
        for (String s : inputArray) {
            if (s.equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean inArray (String[] arrayToCheck, String checkedValue){
        for (String s : arrayToCheck){
            if (s.equals(checkedValue)){
                return true;
            }
        }
        return false;
    }

    protected static Integer[] toIntegerArray (String[] stringToConvert){
        Integer [] convertedToInt = new Integer[stringToConvert.length];
        for (int i=0; i< stringToConvert.length; i++){
            convertedToInt[i] = Integer.parseInt(stringToConvert[i]);
        }
        return convertedToInt;
    }

}
