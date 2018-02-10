package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder sb = new StringBuilder();

        int counter = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }

            if (!(counter == exactNumberOfDuplications)) {
                sb.append(this.array[i] + ",");
            }
            counter = 0;
        }
        String [] removedDupArray = sb.toString().split(",");


        return removedDupArray;

    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        StringBuilder sb = new StringBuilder();

        int counter = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }

            if ((counter < maxNumberOfDuplications)) {
                sb.append(this.array[i] + ",");
            }
            counter = 0;
        }
        String [] removedDupArray = sb.toString().split(",");
        if(removedDupArray[0].equals("")) {
            return new String[0];
        }

        return removedDupArray;
    }
}
