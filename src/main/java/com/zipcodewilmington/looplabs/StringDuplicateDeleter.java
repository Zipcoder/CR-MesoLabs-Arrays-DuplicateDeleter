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

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {


        return new String[0];
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return removeNumber(exactNumberOfDuplications);
    }

    public String[] removeNumber(int max) {
        //StringBuilder r = new StringBuilder();
        String[] result = new String[0];

        String[] temp = new String[1];
        int sum = 0;


        for (int i = 0; i < this.array.length; i++) {
             temp[0] = this.array[i];

            if (countStrings(temp) == max) {

                result = Arrays.copyOf(result, sum + 1);
                result[sum] = temp[0];
                sum++;
            }
        }
        return result;
    }

    public int countStrings(String[] s) {
        int count = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(s[0])) {
                count++;

            }
        }
        printInt(count);
        return count;
    }

    /**
     * @param something prints each elment in the array
     */
    public void printMethod(String[] something) {
        for (String i : something) {

            System.out.println(i.toString());
        }
    }
    public void printInt(int count){
        String  s = "";
        s += count;
        System.out.println(s);
    }
}