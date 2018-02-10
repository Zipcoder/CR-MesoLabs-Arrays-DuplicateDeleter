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

        // for each interger in the array remove max number of the duplications;
        Integer[] someNumers = this.array;
        Integer[] exactRemoved = new Integer[0];
        int count = 0;
        int max = 0;
        /*sorts the array of Intergers numbers*/
        Arrays.sort(someNumers);
        for (Integer n : someNumers) {
            System.out.println(n.toString());
        }

        for (int i = 1; i < someNumers.length - 1; i++) {
            exactRemoved = Arrays.copyOf(exactRemoved, count + 1);
            if (exactRemoved[i] == someNumers[i + 1] && max != exactNumberOfDuplications) {
                exactRemoved[count] = someNumers[i];

                count++;
                max++;
            }
            exactRemoved[count] = someNumers[i];
        }
        return exactRemoved;
    }
}