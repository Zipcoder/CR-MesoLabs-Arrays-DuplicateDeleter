package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public boolean elementOccursLessTimesThanMaxThreshhold(String elementBeingExamined, int maxNumberOfDuplications) {
        int occurencesOfElement = 0;
        for (String value : this.array) {
            if (value.equals(elementBeingExamined)) {
                occurencesOfElement++;
            }
        }
        return occurencesOfElement < maxNumberOfDuplications;
    }


    public boolean elementOccursExactNumberGiven(String elementBeingExamined, int exactNumberOfDuplications) {
        int occurencesOfElement = 0;
        for (String value : this.array) {
            if (value.equals(elementBeingExamined)) {
                occurencesOfElement++;
            }
        }
        return occurencesOfElement != exactNumberOfDuplications;
    }


    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] finalArray = new String[this.array.length];
        int iterator = 0;
        for (String value : this.array) {
            if (elementOccursLessTimesThanMaxThreshhold(value, maxNumberOfDuplications)) {
                finalArray[iterator] = value;
                iterator++;
                System.out.println(value);
            }
        }
        int countOfNotNullElements = 0;
        for (String value : finalArray) {
            if (value != null) {
                countOfNotNullElements++;
            }
        }
        System.out.println("NOT NULL ELEMNTS " + countOfNotNullElements);
        String[] finalfinalArray = new String[countOfNotNullElements];
        for (int i = 0; i < countOfNotNullElements; i++) {
            finalfinalArray[i] = finalArray[i];
        }
        return finalfinalArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] finalArray = new String[this.array.length];
        int iterator = 0;
        for (String value : this.array) {
            if (elementOccursExactNumberGiven(value, exactNumberOfDuplications)) {
                finalArray[iterator] = value;
                iterator++;
                System.out.println(value);
            }
        }
        int countOfNotNullElements = 0;
        for (String value : finalArray) {
            if (value != null) {
                countOfNotNullElements++;
            }
        }
        System.out.println("NOT NULL ELEMNTS " + countOfNotNullElements);
        String[] finalfinalArray = new String[countOfNotNullElements];
        for (int i = 0; i < countOfNotNullElements; i++) {
            finalfinalArray[i] = finalArray[i];
        }
        return finalfinalArray;
    }
}
