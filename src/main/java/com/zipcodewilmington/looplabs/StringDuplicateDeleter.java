package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] revArray = new String[0];
        for (int i = 0; i < this.array.length; i++) {
            if (getOccForStrings(this.array, this.array[i]) < maxNumberOfDuplications) {
                int currentIndex = revArray.length;
                revArray = Arrays.copyOf(revArray, currentIndex + 1);
                revArray[currentIndex] = this.array[i];
            }
        }
        return revArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] revArray = new String[0];
        for(int i = 0; i < this.array.length; i++){
            if(getOccForStrings(this.array, this.array[i]) != exactNumberOfDuplications){
                int currentIndex = revArray.length;
                revArray = Arrays.copyOf(revArray, currentIndex+1);
                revArray[currentIndex] = this.array[i];
            }
        }
        return revArray;
    }

    public int getOccForStrings(String[] targetArray, String targetString){
        int countForOcc = 0;
        for(int i = 0; i < targetArray.length; i++){
            if (targetArray[i].equals(targetString)){
                countForOcc++;
            }
        }
        return countForOcc;
    }
}
