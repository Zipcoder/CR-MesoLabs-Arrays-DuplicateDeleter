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

    public static int countDuplicates (String[] array, String value) {
        int dupeCount = 0;
        for(int i = 0; i < array.length; i++) {
            if(value.equals(array[i])) dupeCount++;
        }
        return dupeCount;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] myArray = Arrays.copyOf(this.array, this.array.length);
        int count = 0;
        for(String keepIt: myArray) {
            int x = countDuplicates(myArray, keepIt);
            if (x < maxNumberOfDuplications) {
                myArray[count] = keepIt;
                count++;
            }
        }
        return Arrays.copyOf(myArray,count);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] newArray = Arrays.copyOf(this.array, this.array.length);
        int count = 0;
        for(String keep: array) {
            int x = countDuplicates(array, keep);
            if (x != exactNumberOfDuplications) {
                newArray[count] = keep;
                count++;
            }
        }
        return Arrays.copyOf(newArray, count);
    }
}