package com.zipcodewilmington.looplabs;

import java.util.Arrays;

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
        boolean checking = true;
        int currentNumber;
        int count = 0;
        int currentIndex = 0;
        StringBuilder dupString = new StringBuilder();

        Arrays.sort(array);
        if (maxNumberOfDuplications < 2) {
            return new Integer[0];
        } else {
            while (checking) {
                currentNumber = array[currentIndex];
                count = Utils.countMatches(currentIndex, count, array, currentNumber);
                Utils.appender(maxNumberOfDuplications, dupString, currentNumber, count);

                if (Utils.isComplete(currentIndex, count, array)) {
                    checking = false;
                } else {
                    currentIndex += count;
                    count = 0;
                }
            }
            String[]  dupArray= dupString.toString().split(",");
            Integer[] dupNumArray = new Integer[dupArray.length];
            int i = 0;

            for (String str: dupArray) {
                dupNumArray[i] = Integer.parseInt(str);
                i++;
            }
            return dupNumArray;
        }
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        boolean checking = true;
        int currentNumber;
        int count = 0;
        int currentIndex = 0;
        StringBuilder dupString = new StringBuilder();

        Arrays.sort(array);
        while(checking) {
            currentNumber = array[currentIndex];
            count = Utils.countMatches(currentIndex, count, array, currentNumber);
            Utils.appendExact(exactNumberOfDuplications, dupString, currentNumber, count);

            if (Utils.isComplete(currentIndex, count, array)) {
                checking = false;
            } else {
                currentIndex += count;
                count = 0;
            }
        }
        String[]  dupArray= dupString.toString().split(",");
        Integer[] dupNumArray = new Integer[dupArray.length];
        int i = 0;

        for (String str: dupArray) {
            dupNumArray[i] = Integer.parseInt(str);
            i++;
        }
        return dupNumArray;

    }

}
