package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
                super(intArray);
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder intStringInProgress = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                intStringInProgress.append(this.array[i]);
            }
            counter = 0;
        }
        String [] removedDuplicatesArray = intStringInProgress.toString().split("");
        Integer[] stringBuilderArray = new Integer[removedDuplicatesArray.length];
        return getIntegersRepeatable(removedDuplicatesArray, stringBuilderArray);
    }

    public Integer[] removeDuplicates (int maxNumberOfDuplications){
        StringBuilder intStringInProgress = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }
            if ((counter < maxNumberOfDuplications)) {
                intStringInProgress.append(this.array[i]);
            }
            counter = 0;
        }
        String [] removedDuplicatesArray = intStringInProgress.toString().split("");
        Integer[] sbArray = new Integer[removedDuplicatesArray.length];
        return getIntegersRepeatable(removedDuplicatesArray, sbArray);
    }

    private Integer[] getIntegersRepeatable(String[] removedDupArray, Integer[] arrayFromStringBuilder) {
        if (!removedDupArray[0].equals("")){
            for (int i = 0; i < arrayFromStringBuilder.length; i++){
                arrayFromStringBuilder[i] = Integer.parseInt(removedDupArray[i]);
            }
            return arrayFromStringBuilder;
        } else {
            return new Integer[0];
        }
    }

}