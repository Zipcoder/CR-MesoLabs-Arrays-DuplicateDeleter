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

        String[] dupeFree = noDupes.split(" ");
        //System.out.println(dupeFree.length);

        if (countAdded > 0) {
            Integer[] dupeFreeIntArray = new Integer[dupeFree.length];

            for (int i = 0; i < dupeFree.length; i++) {
                dupeFreeIntArray[i] = Integer.parseInt(dupeFree[i]);
            }
            return dupeFreeIntArray;
        } else {
            Integer[] emptyIntArray = new Integer[0];
            return emptyIntArray;
        }


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
