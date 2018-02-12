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
    public Integer[] removeDuplicates(int maxCopies) {

        StringBuilder goku = new StringBuilder();

        for (Integer ssjGoku : array) {

            int count = 0;

            for (int i = 0; i < array.length; i++) {
                Integer gokuLevel = array[i];
                if (ssjGoku == gokuLevel)
                    count++;
            }

                if (count < maxCopies) {
                    goku.append(ssjGoku);
                    goku.append(" ");
            }
        }

                    String[] powerUp = goku.toString().split(" ");
                if (goku.toString().isEmpty()){

            return new Integer[0];
        }

            Integer[] ssjTwo = new Integer[powerUp.length];
            for (int i = 0; i < powerUp.length; i++) {

                if (!powerUp[i].isEmpty()) {
                    ssjTwo[i] = new Integer(powerUp[i]);
            }
        }

        return ssjTwo;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        StringBuilder vegeta = new StringBuilder();

        for (Integer integer : array) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                Integer comp = array[i];
                if (integer == comp)
                    count++;
            }

                if (count != exactNumberOfDuplications) {
                    vegeta.append(integer);
                    vegeta.append(" ");
            }
        }

            String[] ssjVegeta = vegeta.toString().split(" ");
            Integer[] superVegeta = new Integer[ssjVegeta.length];
        for (int i = 0; i < ssjVegeta.length; i++) {
            superVegeta[i] = new Integer(superVegeta[i]);
        }

        return superVegeta;
    }
}

