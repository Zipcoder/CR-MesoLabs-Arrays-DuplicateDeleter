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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder dupes = new StringBuilder();
        int dupeCount = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    dupeCount++;
                }
            }
            if (!(dupeCount == exactNumberOfDuplications)) {
                dupes.append(this.array[i]);
                dupes.append(",");
            }
            dupeCount = 0;
        }
        String[] dupesRemoved = dupes.toString().split(",");
        return dupesRemoved;
    }


    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        StringBuilder dupes = new StringBuilder();
        int dupeCount = 0;
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    dupeCount++;
                }
            }
            if (!(dupeCount >= maxNumberOfDuplications)) {
                dupes.append(this.array[i]);
                dupes.append(",");
            }
            dupeCount = 0;
        }
        String[] dupesRemoved = dupes.toString().split(",");
        if (!dupesRemoved[0].equals("")) {
            return dupesRemoved;
        } else {
            String[] nothing = new String[0];
            return nothing;
        }
    }
}
