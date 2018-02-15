package com.zipcodewilmington.looplabs;

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

        String removeDuplicates = "";
        int counter = 0;
        String[] emptyArray = {};


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
            return stringArray;
        }
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {


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
            String[] stringArray = removeDuplicates.split(" ");
            return stringArray;


        }
    }


