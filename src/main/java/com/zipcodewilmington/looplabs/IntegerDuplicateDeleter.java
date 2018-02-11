package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {



    public IntegerDuplicateDeleter (Integer [] intArray){
        super(intArray);
    }

//    public Integer[][] getPhoneBook(this.array) {
//        Integer[][] dups = new Integer [0][];
//
//        //build it
//
//        return dups;
//    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications){
        Integer[][] dups = new Integer [0][];
        Integer[] response = new Integer[0];
        for (int i = 0; i < this.array.length; i++){ // look at each thing
            Integer [] keyValuePair = new Integer[2];
            int key = this.array[i];
            int value = 1;
            keyValuePair[0] = key; // the data (String, Integer, whatever)
            keyValuePair[1] = value; // value 1 == times occurred
            boolean found = false;
            for(int x = 0; x < dups.length; x ++){ //this one builds the dictionary
                if (dups[x][0].equals(this.array[i])) { // look up this thing
                    if (dups[x][1] < maxNumberOfDuplications) { //how many times seen this thing?
                        response = appendSingleArray(response, this.array[i]);
                        // save it
                    }
                    dups[x][1] ++; // increment times occurred
                    found = true;
                    break;
                }
            }
            if(!found){ // if not found,
                dups = appendArray(dups, keyValuePair);
            }

        }
        return response;
    }
    private Integer[] appendSingleArray(Integer[] input, Integer value){
        int size = input.length  +1;
        Integer[] temp = new Integer[size];
        System.arraycopy(input, 0 , temp, 0, input.length);
        temp[temp.length -1] = value;
        return temp;
    }

    public Integer[][] appendArray (Integer [][] input, Integer [] keyValuePair){
        int size = input.length +1;
        Integer[][] temp = new Integer[size][];
        System.arraycopy(input, 0, temp, 0, input.length);
        temp[temp.length-1] = keyValuePair;
        return temp;
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        return null;
    }



}
