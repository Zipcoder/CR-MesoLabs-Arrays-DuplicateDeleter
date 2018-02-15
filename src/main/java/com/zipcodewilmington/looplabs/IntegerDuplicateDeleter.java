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
        Integer[] copyArr = Arrays.copyOf(this.array, this.array.length);

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
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] copyArr = Arrays.copyOf(this.array, this.array.length);

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



