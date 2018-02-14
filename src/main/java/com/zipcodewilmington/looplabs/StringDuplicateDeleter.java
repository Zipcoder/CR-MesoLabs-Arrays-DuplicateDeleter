package com.zipcodewilmington.looplabs;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] StringArray) {
        super(StringArray);
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {

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
            String[] emptyfinalIntArr = new String[emptyArray.length];
            for (int m = 0; m < emptyfinalIntArr.length; m++) {
                emptyfinalIntArr[m] = emptyArray[m];
            }
            return emptyfinalIntArr;
        } else {
            String[] finalStringArr = nonDups.split(" ");
            String[] finalIntArr = new String[finalStringArr.length];
            for (int m = 0; m < finalIntArr.length; m++) {
                finalIntArr[m] = finalStringArr[m];
            }
            return finalIntArr;
        }
    }


    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
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
        String[] finalIntArr = new String[finalStringArr.length];

        for (int m = 0; m < finalIntArr.length; m++) {
            finalIntArr[m] = finalStringArr[m];
        }
        return finalIntArr;

    }
}