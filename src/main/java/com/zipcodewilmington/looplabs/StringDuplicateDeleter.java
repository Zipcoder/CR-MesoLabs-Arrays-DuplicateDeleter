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
        String without = "";
        int counter = 0;
        int times = 0;

        for (int x = 0; x < this.array.length; x ++) {
            for(int y = 0; y < this.array.length; y++) {
                if (this.array[x].equals(this.array[y])) {
                    counter++;
                }
            }
            if (counter < maxNumberOfDuplications) {
                without += this.array[x] + " ";
                times++;
            }
            counter = 0;
        }
        String[] last = without.split(" ");

        if (times > 0) {
            return last;

        } else {
            String[] going = new String[0];
            return going;
        }


    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String without = "";
        int counter = 0;

        for (int x = 0; x < this.array.length; x ++) {
            for(int y = 0; y < this.array.length; y++) {
                if (this.array[x].equals(this.array[y])) {
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                without += this.array[x] + " ";
            }
            counter = 0;
        }
        String[] last = without.split(" ");

        System.out.println(last);
        return last;
    }
}
