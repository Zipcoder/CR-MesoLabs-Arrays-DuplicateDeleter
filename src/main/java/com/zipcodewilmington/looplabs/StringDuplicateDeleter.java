package com.zipcodewilmington.looplabs;

import java.util.Arrays;

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

        String[] copyArr = Arrays.copyOf(this.array, this.array.length);

        int currentIndex = 0;
        while (currentIndex < copyArr.length) {
            int numOccurrences = getNumberOfOccurrences(copyArr, copyArr[currentIndex]);

            if (numOccurrences >= maxNumberOfDuplications) {
                copyArr = removeValue(copyArr, copyArr[currentIndex]);
            } else {
                currentIndex++;
            }
        }

        return copyArr;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] copyArr = Arrays.copyOf(this.array, this.array.length);

        int currentIndex = 0;
        while (currentIndex < copyArr.length) {
            int numOccurrences = getNumberOfOccurrences(copyArr, copyArr[currentIndex]);

            if (numOccurrences == exactNumberOfDuplications) {
                copyArr = removeValue(copyArr, copyArr[currentIndex]);
            } else {
                currentIndex++;
            }
        }
        return copyArr;
    }
}
