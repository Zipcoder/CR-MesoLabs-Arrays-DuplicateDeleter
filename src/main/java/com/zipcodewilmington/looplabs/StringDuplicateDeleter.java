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

    public static void main (String [] args){
        String [] aTest = new String[]{"aba", "aba", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        System.out.println(counter(aTest,"bba"));
        System.out.println(Arrays.toString((deleteString(aTest,"bbb"))));
    }


    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        int deleteStringsCount = 0;
        String [] deleteString = new String[0];
        String [] myAnswerArray = this.array;

        for (int i = 0; i < this.array.length; i++)
        {
            if((counter(this.array, this.array[i])) >= maxNumberOfDuplications)
            {
                deleteString = Arrays.copyOf(deleteString, deleteString.length + 1);
                deleteString[deleteStringsCount] = this.array[i];
                deleteStringsCount++;


            }


        }

        for (String i : deleteString){

            myAnswerArray = deleteString(myAnswerArray, i);
        }

        return myAnswerArray;
    }



    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int deleteCount = 0;
        String [] aDeleterString = new String[0];
        String [] finalArray = this.array;

        for (int i = 0; i < this.array.length; i++)
        {
            if ((counter(this.array, this.array[i])) == exactNumberOfDuplications)
            {
                aDeleterString = Arrays.copyOf(aDeleterString, aDeleterString.length + 1);
                aDeleterString[deleteCount] = this.array[i];
                deleteCount++;

            }
        }

        for (String i : aDeleterString)
        {

            finalArray = (deleteString(finalArray, i));
        }

        return finalArray;

    }


    public static int counter(String[] inputArray, String value) {

        int count = 0;

        /*
        for:each loop that goes through every element in the inputArray
         */
        for (String element : inputArray) {

            if (element.equals(value)) {
                count++;

            }
        }

        return count;

    }


    public static String[] deleteString(String[] inputArray, String valueToRemove)
    {
        String[] secondStringArray = new String [0];
        int deleteStringCounter = 0;

        for (int i = 0; i < inputArray.length; i++){
            if (!(inputArray[i].equals(valueToRemove)))
            {
                secondStringArray = Arrays.copyOf(secondStringArray, secondStringArray.length + 1);
                secondStringArray[deleteStringCounter] = inputArray[i];
                deleteStringCounter++;

            }
        }

        return secondStringArray;

    }


}