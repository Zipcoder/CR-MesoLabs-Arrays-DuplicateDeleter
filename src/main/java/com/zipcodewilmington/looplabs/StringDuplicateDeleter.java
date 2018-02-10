package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String noDupes = "";
        int occurences = 0;
        int countAdded = 0;

        for (int i = 0; i < this.array.length; i++) {

            for (int k = 0; k < this.array.length; k++) {

                if (this.array[k] == (this.array[i])) {
                    occurences++;
                }
            }

            if (occurences < maxNumberOfDuplications) {
                noDupes += this.array[i] + " ";
                countAdded++;
            }
            occurences = 0;
        }

        if (countAdded > 0) {

            String[] dupeFree = noDupes.split(" ");
            return dupeFree;

        } else {
            String[] emptyArray = new String[0];
            return emptyArray;
        }
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String exactDupes = "";
        int occurences = 0;

        for (int i = 0; i < this.array.length; i++) {

            for (int k = 0; k < this.array.length; k++) {

                if (this.array[k] == (this.array[i])) {
                    occurences++;
                }
            }

            if (occurences != exactNumberOfDuplications) {
                exactDupes += this.array[i] + " ";
            }
            occurences = 0;
        }

        String[] exactDupesArray = exactDupes.split(" ");

        return exactDupesArray;
    }
}
