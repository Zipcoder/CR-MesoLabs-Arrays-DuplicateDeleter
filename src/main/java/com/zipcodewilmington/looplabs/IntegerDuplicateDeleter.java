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

        StringBuilder taco = new StringBuilder();

        for (Integer loopingTaco : array) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                Integer comparingTaco = array[i];
                if (loopingTaco == comparingTaco)
                    count++;
            }

            if (count < maxNumberOfDuplications) {
                taco.append(loopingTaco);
                taco.append(" ");
            }
        }

        String[] firstTry = taco.toString().split(" ");
        if(taco.toString().isEmpty()){
            return new Integer[0];
        }
        Integer[] secondTry = new Integer[firstTry.length];
        for (int i = 0; i < firstTry.length; i++) {
            if(!firstTry[i].isEmpty()) {
                secondTry[i] = new Integer(firstTry[i]);
            }

        }
        return secondTry;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        StringBuilder taco = new StringBuilder();

        for (Integer integer : array) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                Integer comp = array[i];
                if (integer == comp)
                    count++;
            }

            if (count != exactNumberOfDuplications) {
                taco.append(integer);
                taco.append(" ");
            }
        }

        String[] firstString = taco.toString().split(" ");
        Integer[] secondString = new Integer[firstString.length];
        for (int i = 0; i < firstString.length; i++) {
            secondString[i] = new Integer(firstString[i]);

        }

        return secondString;
    }
}

