package com.zipcodewilmington.looplabs;

import java.util.Arrays;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public static void main (String [] args)
    {
        Integer[] tester={1, 2, 2, 3, 3, 4, 6, 7, 8, 8, 9};
        int count = counter(tester,3);
        System.out.println(count);
        //System.out.println(Arrays.toString(deleteNumbers(tester,2)));

        ;

    }

    @Override
    //At least a certain number of times
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        //Calling a method inside of a method
        //counter();
        int theDeleteCounter = 0;
        Integer [] toTheDelete = new Integer[0];
        Integer [] theAnswerArray = this.array;

        for (int i = 0; i < this.array.length; i++)
        {
            if ((counter(this.array, this.array[i])) >= maxNumberOfDuplications)
            {
                toTheDelete = Arrays.copyOf(toTheDelete, toTheDelete.length + 1);
                toTheDelete[theDeleteCounter] = this.array[i];
                theDeleteCounter++;

            }



        }

        for (Integer i : toTheDelete)
        {
            theAnswerArray = deleteNumbers(theAnswerArray, i);
        }

        return theAnswerArray;


    }

    @Override
    //Exact number of times a duplicate occurs
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        //Calling a method inside of a method
        int deleteCounter = 0;
        Integer [] toDelete = new Integer[0];
        Integer [] answerArray = this.array;

        for (int i = 0; i < this.array.length; i++)
        {
            if ((counter(this.array, this.array[i])) == exactNumberOfDuplications)
            {
                toDelete = Arrays.copyOf(toDelete, toDelete.length +1);
                toDelete[deleteCounter] = this.array[i];
                deleteCounter++;

            }

        }

        for (Integer i : toDelete)
        {
            answerArray = deleteNumbers(answerArray, i);
        }


        return answerArray;
    }

    public static int counter (Integer[] inputArray, Integer value)
    {

        int count = 0;

        /*
        for:each loop that goes through every element in the inputArray
         */
        for (int element: inputArray){

            if (element == value)
            {
                count++;

            }
        }

        return count;

    }

    public static Integer [] deleteNumbers(Integer[] inputArray, Integer valueToRemove) {
        Integer[] firstArray = inputArray;
        Integer[] secondArray = new Integer[0];
        int theCounter = 0;

        //
        for (int i = 0; i< inputArray.length; i++) {
            if (firstArray[i] != valueToRemove) {
                secondArray = Arrays.copyOf(secondArray, secondArray.length + 1);
                secondArray[theCounter] = firstArray[i];
                theCounter++;

            }

        }

        return secondArray;
        //secondArray is completed

    }






}
