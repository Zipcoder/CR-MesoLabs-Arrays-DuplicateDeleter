package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    private int lastIndex;
    private static final Integer[] ZERO_LENGTH_INTEGER_ARRAY = new Integer[0];

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        //Integer[] testArr = new Integer[2];
        //return testArr;
        Integer[] inputArray = this.array;
        lastIndex = inputArray.length - 1;

        StringBuilder sb = new StringBuilder();

        int frequency = 1;
        int times = maxNumberOfDuplications;
        for (int i = 0; i < inputArray.length; i++) {
            if ((i != lastIndex) && (inputArray[i] == inputArray[i + 1])) {
                frequency++;
            } else {
                if (!(frequency >= times)) {
                    while (frequency >= 1) {
                        sb.append(inputArray[i] + ",");
                        frequency--;
                    }
                }
                frequency = 1;
            }
        }

        if (sb == null || sb.toString().equals("")) {
            return ZERO_LENGTH_INTEGER_ARRAY;
        } else {

            //string array
            String[] strArr = sb.toString().split(",");
            int strArrLength = strArr.length;

            //Integer array
            Integer[] integerArr = new Integer[strArrLength];

            for (int i = 0; i < strArrLength; i++) {
                integerArr[i] = Integer.parseInt(strArr[i]);
            }

            return integerArr;
        }
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        //Integer[] testArr = new Integer[2];
        //return testArr;

        Integer[] inputArray = this.array;
        lastIndex = inputArray.length - 1;

        StringBuilder sb = new StringBuilder();

        int frequency = 1;
        int times = exactNumberOfDuplications;
        for (int i = 0; i < inputArray.length; i++) {
            if ((i != lastIndex) && (inputArray[i] == inputArray[i + 1])) {
                frequency++;
            } else {
                if (frequency != times) {
                    while (frequency >= 1) {
                        sb.append(inputArray[i] + ",");
                        frequency--;
                    }
                }
                frequency = 1;
            }
        }

        if (sb == null || sb.toString().equals("")) {
            return ZERO_LENGTH_INTEGER_ARRAY;
        } else {
            //string array
            String[] strArr = sb.toString().split(",");
            int strArrLength = strArr.length;

            //Integer array
            Integer[] integerArr = new Integer[strArrLength];

            for (int i = 0; i < strArrLength; i++) {
                integerArr[i] = Integer.parseInt(strArr[i]);
            }

            return integerArr;
        }
    }
}
