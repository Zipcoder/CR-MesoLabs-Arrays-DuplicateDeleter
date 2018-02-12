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
        String nonDups = "";
        int count = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k <this.array.length; k++) {
                if (this.array[i].equals(this.array[k])){
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                nonDups += this.array[i] + " ";
            }
            count = 0;
        }
        if (nonDups == ""){
            String [] emptyArray = new String[0];
            return emptyArray;
        }
        else {
            String [] finalString = nonDups.split(" ") ;
            return finalString;
        }


    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String nonDups = "";
        int count = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k < this.array.length; k++) {

                if (this.array[i].equals(this.array[k])) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                nonDups += this.array[i] + " ";
            }
            count = 0;
        }

            String[] finalString = nonDups.split(" ");
            return finalString;

    }



}
