package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    //constructor
    public StringDuplicateDeleter (String[] intArray){
        super(intArray);

    }
    String[] anIntArray = Arrays.copyOf(this.array,this.array.length);


    public String[] removeDuplicates(int maxNumberOfDuplications) {
        //create copy of array, this will be your new array
        //read array
        //getNumberOfOccurences
        //if getNumberOfOccurences appears more than once
        //removeValue
        //else
        //store in newArray
        //return values

        /*private static final NULL_ARRAY = new String[0];
        else if (anIntArray == null){
            return NULL_ARRAY;
        }*/
        /*okay first we are making a new array, but a copy, it will copy this.array which is intArray and copy
        its length (it takes two parameters)*/

        int noDuplicates = 0;
        String[] duplicates = new String[0];
        int duplicatesIndex = 0;
        for (int i = 0; i < anIntArray.length; i++) {
            if (contains(duplicates, anIntArray[i])) {
                continue;
            } else if (getNumberOfOccurrences(anIntArray, anIntArray[i]) >= maxNumberOfDuplications) {
                duplicates = Arrays.copyOf(duplicates, duplicates.length + 1);
                duplicates[duplicatesIndex] = array[i];
                duplicatesIndex++;
            }
        }
        String[] checking = Arrays.copyOf(anIntArray, anIntArray.length);
        for (String k : duplicates) {
            checking = removeValue(checking, k);

        }
        return checking;
    }




    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){

        //create copy of array, this will be your new array
        //read array
        //getNumberOfOccurences
        //if getNumberOfOccurences appears more than once
        //removeValue
        //else
        //store in newArray
        //return values

        /*private static final NULL_ARRAY = new String[0];
        else if (anIntArray == null){
            return NULL_ARRAY;
        }*/
        /*okay first we are making a new array, but a copy, it will copy this.array which is intArray and copy
        its length (it takes two parameters)*/

        int noDuplicates = 0;
        String[] duplicates = new String[0];
        int duplicatesIndex = 0;
        for (int i = 0; i < anIntArray.length; i++) {
            if (contains(duplicates, anIntArray[i])) {
                continue;
            } else if (getNumberOfOccurrences(anIntArray, anIntArray[i]) == exactNumberOfDuplications) {
                duplicates = Arrays.copyOf(duplicates, duplicates.length + 1);
                duplicates[duplicatesIndex] = array[i];
                duplicatesIndex++;
            }
        }
        String[] checking = Arrays.copyOf(anIntArray, anIntArray.length);
        for (String k : duplicates) {
            checking = removeValue(checking, k);

        }
        return checking;

    }




    public static int getNumberOfOccurrences(String[] array, String value) {

        //created a countOccurence holder, to hold value everytime it appears

        int countOccurence = 0;

        for (String myValue : array) {
            if(myValue.equals(value))
                countOccurence++;
        }

        return countOccurence;
    }


    public static String[] removeValue(String[] array, String valueToRemove) {
        /*1.we create this 'newSize' to hold the size of the array
        2.now we have to create the array, with the new array size.
        3.created a placeholder for things that were not duplicates
        4.looping through the array
        5. if the array indexes are not equal to valueToRemove
        6. the next line basically swaps the array i for the other & we add to the counter
        7. printing the new results */
        int newSize = array.length - getNumberOfOccurrences(array, valueToRemove);
        String[] outputArray = new String[newSize];
        int indexNotDuplicates = 0;

        for (int i =0; i <array.length; i++){
            if(!array[i].equalsIgnoreCase(valueToRemove)){
                outputArray[indexNotDuplicates] = array[i];
                indexNotDuplicates++;
            }
        }
        return outputArray;
    }

    public static boolean contains(String[] array, String value) {
        /*the enhanced for loop starts at String myValue and searches to the end of array(so at every index comparing
        . Then we add an if statement to see if the beginning of myValue equals value (which is what we are looking
        for). */
        for (String myValue : array) {
            if(myValue.equals(value)){
                return true;
            }
        }
        return false;
    }





}
