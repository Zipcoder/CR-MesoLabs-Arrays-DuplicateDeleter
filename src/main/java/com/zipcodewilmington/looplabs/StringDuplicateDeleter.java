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

        String hold = "";
        int counter = 0;

        for(int i = 0; i < this.array.length; i++){
            for (int j = 0; j <this.array.length; j++){

                if(this.array[j].equals(this.array[i])){
                    counter++;
                }
            }
            if (counter < maxNumberOfDuplications) {
                hold += this.array[i] + " ";
            }
            counter = 0;
        }

        if (hold == ""){
            String[] emptyArray = new String[0];
            return emptyArray;
            } else {
            String[] yeah = hold.split(" ");
            return yeah;
        }

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String hold = "";
        int counter = 0;

        for(int i = 0; i < this.array.length; i++){
            for (int j = 0; j <this.array.length; j++){

                if (this.array[j].equals(this.array[i])){
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                hold += this.array[i] + " ";
            }
            counter = 0;
        }

        String[] yeah = hold.split(" ");

        return yeah;
    }
}
