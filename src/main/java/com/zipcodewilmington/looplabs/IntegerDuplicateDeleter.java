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

    @Override

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        String nonDups = "";
        int count = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k < this.array.length; k++) {
                if (this.array[i].equals(this.array[k])) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                nonDups += this.array[i] + " ";
            }
            count = 0;
        }
        if (nonDups == "") {
            String[] emptyArray = new String[0];
            Integer[] emptyfinalIntArr = new Integer[emptyArray.length];
            for (int m = 0; m < emptyfinalIntArr.length; m++) {
                emptyfinalIntArr[m] = Integer.parseInt(emptyArray[m]);
            }
            return emptyfinalIntArr;
        } else {
            String[] finalStringArr = nonDups.split(" ");
            Integer[] finalIntArr = new Integer[finalStringArr.length];
            for (int m = 0; m < finalIntArr.length; m++) {
                finalIntArr[m] = Integer.parseInt(finalStringArr[m]);
            }
            return finalIntArr;
        }

    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String nonDups = "";
        int count = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k < this.array.length; k++) {

                if (this.array[i].equals(this.array[k])) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                nonDups += this.array[i] + " ";
            }
            count = 0;
        }

        String[] finalStringArr = nonDups.split(" ");
        Integer[] finalIntArr = new Integer[finalStringArr.length];

        for (int m = 0; m < finalIntArr.length; m++) {
            finalIntArr[m] = Integer.parseInt(finalStringArr[m]);
        }
        return finalIntArr;


    }
}