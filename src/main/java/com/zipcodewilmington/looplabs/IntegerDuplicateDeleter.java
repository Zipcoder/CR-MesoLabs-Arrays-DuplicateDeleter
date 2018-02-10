package com.zipcodewilmington.looplabs;

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

        String hold = "";
        int counter = 0;

        // Goes through first index of Array and check for duplicates until end of array

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {

                if (this.array[j].equals(this.array[i])) {
                    counter++;
                }
            }
            if (counter < maxNumberOfDuplications) {
                hold += this.array[i] + " ";
            }
            counter = 0;
        }

        // I know how ugly this looks but....
        // This says if the returned Array is empty with a space it returns an empty array
        // If not it returns the original array that gets converted
        if (hold == "") {
            String[] emptyArray = new String[0];
            Integer[] emptyArray2 = new Integer[emptyArray.length];
            for (int i = 0; i < emptyArray.length; i++) {
                emptyArray2[i] = Integer.parseInt(emptyArray[i]);
            }
            return emptyArray2;
        } else {
            String[] hold2 = hold.split(" ");
            Integer[] hold2Convert = new Integer[hold2.length];
            for (int i = 0; i < hold2.length; i++) {
                hold2Convert[i] = Integer.parseInt(hold2[i]);

            }
            return hold2Convert;
        }
    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String hold = "";
        int counter = 0;

        for(int i = 0; i < this.array.length; i++){
            for (int j = 0; j <this.array.length; j++){

                if(this.array[j].equals(this.array[i])){
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                hold += this.array[i] + " ";
            }
            counter = 0;
        }

        String[] yeah = hold.split(" ");
        Integer[] dude = new Integer[yeah.length];

        for (int i = 0; i < yeah.length; i++){
            dude[i] = Integer.parseInt(yeah[i]);
        }
        return dude;
    }
}
