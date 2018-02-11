package com.zipcodewilmington.looplabs;
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

        String [] resultArray = new String[0];
        for(int i = 0; i < this.array.length; i++){
            if(getNumberOfOccurrences(this.array, this.array[i]) >= maxNumberOfDuplications){
                resultArray = Arrays.copyOf(resultArray, resultArray.length+1);
            }
        }

        return resultArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String [] resultArray = new String[0];
        for(int i = 0; i < this.array.length; i++){
            if(getNumberOfOccurrences(this.array, this.array[i]) == exactNumberOfDuplications){
                resultArray = Arrays.copyOf(resultArray, resultArray.length+1);
            }
        }

        return resultArray;
    }


}
