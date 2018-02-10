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


    /**
     * // remove duplicates return new array;
     *
     * @param maxNumberOfDuplications
     * @return
     */
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        return removeNumber(maxNumberOfDuplications);
    }

    public Integer[] removeNumber(int max) {
        Integer[] result = new Integer[0];
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < this.array.length; i++) {

            temp = this.array[i];

            if (countNumbers(temp) < max) {

                result = Arrays.copyOf( result, sum +1);
                result[sum] = temp;
                sum++;
            }
        }
        return result;
    }

    public int countNumbers(int something) {
        int count = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == something) {
                count++;

            }
        }
       // printInt(count);
        return count;
    }

    /**
     * @param something prints each elment in the array
     */
    public void printMethod(Integer[] something) {
        for (Integer i : something) {

            System.out.println(i.toString());
        }
    }
 public void printInt(int count){
    String  s = "";
    s += count;
     System.out.println(s);
 }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] result = new Integer[0];
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < this.array.length; i++) {

            temp = this.array[i];

            if (countNumbers(temp) != exactNumberOfDuplications) {

                result = Arrays.copyOf( result, sum +1);
                result[sum] = temp;
                sum++;
            }
        }

   return result;

    }
}