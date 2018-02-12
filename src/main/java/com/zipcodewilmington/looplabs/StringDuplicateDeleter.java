package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray){
        super (intArray);
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] noStringDupsArray = new String[0];

        for (int i = 0; i < this.array.length; i++){

            if (getNumberOfOccurrences(this.array, this.array[i]) != exactNumberOfDuplications) {

                int stringElements = noStringDupsArray.length;
                noStringDupsArray = Arrays.copyOf(noStringDupsArray, noStringDupsArray.length + 1);
                noStringDupsArray[stringElements] = this.array[i];

            }

        }

        return noStringDupsArray;
    }

    public static int getNumberOfOccurrences(String[] inputArray, String value) {

        int valueCounter = 0;

        for (String arrayElement : inputArray){

            if (arrayElement.equalsIgnoreCase(value)){

                valueCounter++;
            }

        }

        return valueCounter;
    }


    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] maxDupsArray = new String[0];

        for (int i = 0; i < this.array.length; i++){

            if (getNumberOfOccurrences(this.array, this.array[i]) < maxNumberOfDuplications){

                int arrayElements = maxDupsArray.length;
                maxDupsArray = Arrays.copyOf(maxDupsArray, maxDupsArray.length+1);
                maxDupsArray[arrayElements] = this.array[i];

            }

        }

        return maxDupsArray;
    }
}
