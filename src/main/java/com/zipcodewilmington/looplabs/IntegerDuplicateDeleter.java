package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    private Integer[] result;
    private int counter = 1;
    private int index = 0;
    private int newArrayLength = 0;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer [] result;

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == array[i + 1]) {
                counter++;
                if (counter == exactNumberOfDuplications) {
                    newArrayLength += counter;
                    while (counter > 0) {
                        index = i + 2 - counter;
                        array[index] = null;
                        counter--;
                    }
                }
            } else counter = 1;

        }

        result = buildNewArray();

        if (result.length == array.length) return array; // no changes

        return result;
    }

    private Integer[] buildNewArray(){
        Integer [] temp = new Integer[array.length - newArrayLength];
        index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != null){
                temp[index] = array[i];
                index++;
            }
        }
        return temp;
    }


}
