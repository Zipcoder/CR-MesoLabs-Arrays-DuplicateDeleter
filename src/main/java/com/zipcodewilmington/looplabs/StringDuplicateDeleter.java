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



    private static int countDuplicates (String[] array, String value) {
        int dupeCount = 0;
        for(int i = 0; i < array.length; i++) {
            if(value.equals(array[i])) {
                    dupeCount++;
            }
        }
        return dupeCount;
    }


    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String[] myArray = Arrays.copyOf(this.array, this.array.length);
        String keepString = "";

        for(String keepIt: myArray) {
            int x = countDuplicates(myArray, keepIt);
            if (x < maxNumberOfDuplications) {
                keepString += keepIt + "/";
            }

        }
        if(keepString.equals("")) {
            keepString = "/";
        }

        return keepString.split("/");
    }


    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] newArray = Arrays.copyOf(this.array, this.array.length);
        String minusDeletes = "";

        for(int i = 0; i < newArray.length; i++) {
            int x = countDuplicates(newArray, newArray[i]);
            if (x != exactNumberOfDuplications) {
                minusDeletes += newArray[i] + "/";
            }
        }

        return minusDeletes.split("/");
    }
}

