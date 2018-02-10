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

        //String without = " ";


        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

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
        Integer[] done = new Integer[last.length];
            for (int i = 0; i < last.length; i++) {
                done[i] = Integer.parseInt(last[i]);
            }
        System.out.println(done);
        return done;
    }
}
