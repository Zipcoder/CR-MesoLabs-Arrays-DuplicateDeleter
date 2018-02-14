package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
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


//    public Integer[] removeDuplicates(int maxNumberOfDuplications){
//        Integer[][] dups = new Integer [0][];
//        Integer[] response = new Integer[0];
//        for (int i = 0; i < this.array.length; i++){ // look at each thing
//            Integer [] keyValuePair = new Integer[2];
//            int key = this.array[i];
//            int value = 1;
//            keyValuePair[0] = key; // the data (String, Integer, whatever)
//            keyValuePair[1] = value; // value 1 == times occurred
//            boolean found = false;
//            for(int x = 0; x < dups.length; x ++){ //this one builds the dictionary
//                if (dups[x][0].equals(this.array[i])) { // look up this thing
//                    if (dups[x][1] < maxNumberOfDuplications) { //how many times seen this thing?
//                        response = appendSingleArray(response, this.array[i]);
//                        // save it
//                    }
//                    dups[x][1] ++; // increment times occurred
//                    found = true;
//                    break;
//                }
//            }
//            if(!found){ // if not found,
//                dups = appendArray(dups, keyValuePair);
//            }
//
//        }
//        return response;
//    }
//    private Integer[] appendSingleArray(Integer[] input, Integer value){
//        int size = input.length  +1;
//        Integer[] temp = new Integer[size];
//        System.arraycopy(input, 0 , temp, 0, input.length);
//        temp[temp.length -1] = value;
//        return temp;
//    }
//
//    public Integer[][] appendArray (Integer [][] input, Integer [] keyValuePair){
//        int size = input.length +1;
//        Integer[][] temp = new Integer[size][];
//        System.arraycopy(input, 0, temp, 0, input.length);
//        temp[temp.length-1] = keyValuePair;
//        return temp;
//    }

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

