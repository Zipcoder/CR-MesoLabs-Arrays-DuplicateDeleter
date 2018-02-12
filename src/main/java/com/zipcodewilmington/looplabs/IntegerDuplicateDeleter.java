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


    public boolean elementOccursLessTimesThanMaxThreshhold(int elementBeingExamined, int maxNumberOfDuplications) {
        int occurencesOfElement = 0;
        for (int value : this.array) {
            if (value == elementBeingExamined) {
                occurencesOfElement++;
            }
        }
        return occurencesOfElement < maxNumberOfDuplications;
    }


    public boolean elementOccursExactNumberGiven(int elementBeingExamined, int exactNumberOfDuplications) {
        int occurencesOfElement = 0;
        for (int value : this.array) {
            if (value == elementBeingExamined) {
                occurencesOfElement++;
            }
        }
        return occurencesOfElement != exactNumberOfDuplications;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] finalArray = new Integer[this.array.length];
        int iterator = 0;
        for (int value : this.array) {
            if (elementOccursLessTimesThanMaxThreshhold(value, maxNumberOfDuplications)) {
                finalArray[iterator] = value;
                iterator++;
                System.out.println(value);
            }
        }
        int countOfNotNullElements = 0;
        for (Integer value : finalArray) {
            if (value != null) {
                countOfNotNullElements++;
            }
        }
        System.out.println("NOT NULL ELEMNTS " + countOfNotNullElements);
        Integer[] finalfinalArray = new Integer[countOfNotNullElements];
        for (int i = 0; i < countOfNotNullElements; i++) {
            finalfinalArray[i] = finalArray[i];
        }
        return finalfinalArray;
    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] finalArray = new Integer[this.array.length];
        int iterator = 0;
        for (int value : this.array) {
            if (elementOccursExactNumberGiven(value, exactNumberOfDuplications)) {
                finalArray[iterator] = value;
                iterator++;
                System.out.println(value);
            }
        }
        int countOfNotNullElements = 0;
        for (Integer value : finalArray) {
            if (value != null) {
                countOfNotNullElements++;
            }
        }
        System.out.println("NOT NULL ELEMNTS " + countOfNotNullElements);
        Integer[] finalfinalArray = new Integer[countOfNotNullElements];
        for (int i = 0; i < countOfNotNullElements; i++) {
            finalfinalArray[i] = finalArray[i];
        }
        return finalfinalArray;
    }
}