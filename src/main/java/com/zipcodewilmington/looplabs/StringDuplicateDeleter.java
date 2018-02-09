package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        StringBuilder removedString = new StringBuilder();
        int dupeCount = 0;
        for (int count = 0; count < this.array.length; count++) {
            for (int count2 = 0; count2 < this.array.length; count2++) {
                if (this.array[count].equals(this.array[count2])) {
                    dupeCount++;
                }
            }
            if (!(dupeCount >= maxNumberOfDuplications)) {
                removedString.append(this.array[count]);
                removedString.append(",");
            }
            dupeCount = 0;

        }
        String[] removedStringArray = removedString.toString().split(",");
        if (!removedStringArray[0].equals("")) {
            return removedStringArray;
        } else {
            String[] empty = new String[0];
            return empty;
        }
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder removedString = new StringBuilder();
        int dupeCount = 0;
        for (int count = 0; count < this.array.length; count++) {
            for (int count2 = 0; count2 < this.array.length; count2++) {
                if (this.array[count].equals(this.array[count2])) {
                    dupeCount++;
                }
            }
            if (!(dupeCount == exactNumberOfDuplications)) {
                removedString.append(this.array[count]);
                removedString.append(",");
            }
            dupeCount = 0;

        }
        String[] removedStringArray = removedString.toString().split(",");
        if (!removedStringArray[0].equals("")) {
            return removedStringArray;
        } else {
            String[] empty = new String[0];
            return empty;
        }
    }
}
