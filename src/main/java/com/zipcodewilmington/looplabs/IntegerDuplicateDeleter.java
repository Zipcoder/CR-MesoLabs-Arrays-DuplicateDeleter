package com.zipcodewilmington.looplabs;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        String removeDuplicates = "";
        int counter = 0;
        Integer[] emptyArray = {};

        if (maxNumberOfDuplications <= 1){
            return emptyArray;
        }

        else {
            for (int i = 0; i < this.array.length; i++) {
                for (int j = 0; j < this.array.length; j++) {
                    if (this.array[i] == (this.array[j])) {
                        counter++;
                    }
                }
                if (counter < maxNumberOfDuplications) {
                    removeDuplicates += this.array[i] + " ";
                }
                counter = 0;
            }
            String[] stringArray = removeDuplicates.split(" ");
            Integer[] integerArray = new Integer[stringArray.length];

            for (int k = 0; k < integerArray.length; k++){
                integerArray[k] = Integer.parseInt(stringArray[k]);

            }


            return integerArray;
        }
    }






    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {


        String removeDuplicates = "";
        int counter = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i] == (this.array[j])) {
                    counter++;
                }
            }
                if (counter != exactNumberOfDuplications) {
                    removeDuplicates += this.array[i] + " ";
                }
                counter = 0;
            }
            String [] stringArray = removeDuplicates.split(" ");
            Integer[] integerArray = new Integer[stringArray.length];

            for (int k = 0; k < integerArray.length; k++){
                integerArray[k] = Integer.parseInt(stringArray[k]);

            }


            return integerArray;



    }
}
