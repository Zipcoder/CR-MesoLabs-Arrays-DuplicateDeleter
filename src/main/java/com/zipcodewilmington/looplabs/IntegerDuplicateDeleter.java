package com.zipcodewilmington.looplabs;


/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String noTrips = "";
        int occurences = 0;

        for (int i = 0; i < this.array.length; i++) {

            for (int k = 0; k < this.array.length; k++) {

                if (this.array[k] == (this.array[i])) {
                    occurences++;
                }
            }

            if (occurences != exactNumberOfDuplications) {
                noTrips += this.array[i] + " ";
            }
            occurences = 0;
        }

        String[] noTripsArray = noTrips.split(" ");
        Integer[] noTripsIntArray = new Integer[noTripsArray.length];

        for (int i = 0; i < noTripsArray.length; i++) {
            noTripsIntArray[i] = Integer.parseInt(noTripsArray[i]);
        }

        return noTripsIntArray;
    }
}
