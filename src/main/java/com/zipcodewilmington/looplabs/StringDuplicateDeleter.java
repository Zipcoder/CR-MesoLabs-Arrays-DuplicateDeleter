package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    //constructor
    public StringDuplicateDeleter (String[] intArray){
        super(intArray);
    }


    public String[] removeDuplicates(int maxNumberOfDuplications) {
        //create copy of array, this will be your new array
        //read array
        //getNumberOfOccurences
        //if getNumberOfOccurences appears more than once
            //removeValue
        //else
            //store in newArray
        //return values

        String[] anIntArray = new String(Arrays.copyOf(this.array.length));
        for (int i = 0; i < this.array.length; i++){
            if(getNumberOfOccurences < anIntArray[i]){

            }
        }
        return null;
    }

    public static int getNumberOfOccurrences(String[] array, String value) {

        //created a countOccurence holder, to hold value everytime it appears

        int countOccurence = 0;

        for (String myValue : array) {
            if(myValue.equals(value))
                countOccurence++;
        }

        return countOccurence;
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){

        return null;
    }



}
