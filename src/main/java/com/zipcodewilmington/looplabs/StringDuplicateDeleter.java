package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder stringInProgress = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                stringInProgress.append(this.array[i] + ",");
            }
            counter = 0;
        }
        String [] removedDuplicateArray = stringInProgress.toString().split(",");
        return removedDuplicateArray;
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        StringBuilder stringInProgress = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }
            if ((counter < maxNumberOfDuplications)) {
                stringInProgress.append(this.array[i] + ",");
            }
            counter = 0;
        }
            String [] removedDuplicateArray = stringInProgress.toString().split(",");
        if(removedDuplicateArray[0].equals("")) {
            return new String[0];
        }
        return removedDuplicateArray;
    }

}