package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    private int lastIndex;
    private static final String[] ZERO_LENGTH_STRING_ARRAY = new String[0];

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        //String[] testArr = new String[2];
        //return testArr;

        String[] inputArray = this.array;
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
            return ZERO_LENGTH_STRING_ARRAY;
        } else {
            String[] strArr = sb.toString().split(",");
            return strArr;
        }
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        //String[] testArr = new String[2];
        //return testArr;

        String[] inputArray = this.array;
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
            return ZERO_LENGTH_STRING_ARRAY;
        } else {
            String[] strArr = sb.toString().split(",");
            return strArr;
        }
    }

}
