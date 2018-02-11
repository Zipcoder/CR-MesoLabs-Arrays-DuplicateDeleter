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
        String[] stringArray = toStringArray(this.array);
        StringDuplicateDeleter stringDD = new StringDuplicateDeleter(stringArray);
        String[] stringResult = stringDD.removeDuplicates(maxNumberOfDuplications);
        return StringDuplicateDeleter.toIntegerArray(stringResult);
    }


    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        String[] stringArray = toStringArray(this.array);
        StringDuplicateDeleter stringDD = new StringDuplicateDeleter(stringArray);
        String[] stringResult = stringDD.removeDuplicatesExactly(exactNumberOfDuplications);
        return StringDuplicateDeleter.toIntegerArray(stringResult);
    }

    public static String[] toStringArray (Integer[] intToConvert){
        String[] convertedToString = new String[intToConvert.length];
        for (int i = 0; i< intToConvert.length; i++){
            convertedToString[i] = String.valueOf(intToConvert[i]);
        }
        return convertedToString;
    }
}

