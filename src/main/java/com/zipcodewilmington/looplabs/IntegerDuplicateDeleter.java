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

        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = array[i].toString();
        }
        System.out.println(stringArray);
        StringDuplicateDeleter stringDD = new StringDuplicateDeleter(stringArray);
        String[] deleted = stringDD.removeDuplicates(maxNumberOfDuplications);

        Integer[] intArray = new Integer[deleted.length];
        for (int i = 0; i < deleted.length; i++) {
            intArray[i] = Integer.parseInt(deleted[i]);
        }

        return intArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = array[i].toString();
        }
        System.out.println(stringArray);
        StringDuplicateDeleter stringDD = new StringDuplicateDeleter(stringArray);
        String[] deleted = stringDD.removeDuplicatesExactly(exactNumberOfDuplications);

        Integer[] intArray = new Integer[deleted.length];
        for (int i = 0; i < deleted.length; i++) {
            intArray[i] = Integer.parseInt(deleted[i]);
        }

        return intArray;
    }
}
