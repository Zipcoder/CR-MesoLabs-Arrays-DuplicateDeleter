package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder nonDuplicateString = new StringBuilder();



        for (int outsideNum = 0; outsideNum < array.length; outsideNum++) {
            int counter = 0;

            for (int insideNum = 0; insideNum < this.array.length; insideNum++) {
                if (this.array[outsideNum].equals(this.array[insideNum])) {
                    counter++;
                }
            }

            if (!(counter == exactNumberOfDuplications)) {
                nonDuplicateString.append(this.array[outsideNum]);
            }

        }
        String [] removedDupArray = nonDuplicateString.toString().split("");

        Integer[] sbArray = new Integer[removedDupArray.length];


        return getIntegers(removedDupArray, sbArray);


    }

    private Integer[] getIntegers(String[] removedDupArray, Integer[] sbArray) {
        if (!removedDupArray[0].equals("")){

                for (int i = 0; i < sbArray.length; i++){
                    sbArray[i] = Integer.parseInt(removedDupArray[i]);
                }

                return sbArray;

            } else {
                return new Integer[0];
            }
    }

    @Override
        public Integer[] removeDuplicates (int maxNumberOfDuplications) {
        StringBuilder nonDupString = new StringBuilder();

        for (int outsideNum = 0; outsideNum < this.array.length; outsideNum++) {
            int counter = 0;

            for (int insideNum = 0; insideNum < this.array.length; insideNum++) {
                if (this.array[outsideNum].equals(this.array[insideNum])) {
                    counter++;
                }
            }
            if ((counter < maxNumberOfDuplications)) {
                nonDupString.append(this.array[outsideNum]);
            }
        }
        String[] removedDupArray = nonDupString.toString().split("");

        Integer[] sbArray = new Integer[removedDupArray.length];


        return getIntegers(removedDupArray, sbArray);
    }
}
