package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    private int counter = 0;
    private int index = 0;
    private int newArrayLength = 0;


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
// ain't pretty but it works


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] interimArray = new Integer[array.length];
        System.arraycopy(array,0,interimArray,0,array.length);
        newArrayLength = 0;
        Integer [] result;
        int temp = 0;

        for (int i = 0; i < interimArray.length -1; i++) {
            counter = 0;
            checkForDuplicates(interimArray[i], interimArray);

            if (counter >= maxNumberOfDuplications && interimArray[i] != null) {
                counter = interimArray.length -1;
                temp = interimArray[i];
                while (counter >= 0) {
                    if (interimArray[counter] != null) {
                        if (interimArray[counter] == temp) interimArray[counter] = null;
                    }
                    counter--;
                }
            }
        }

        getNewArrayLength(interimArray);
        result = buildNewArray(interimArray);

        if (result.length == array.length) return array; // no changes

        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] interimArray = new Integer[array.length];
        System.arraycopy(array,0,interimArray,0,array.length);
        Integer [] result;
        newArrayLength = 0;
        for (int i = 0; i < array.length -1; i++) {
            counter = 0;
            checkForDuplicates(interimArray[i],interimArray);

                if (counter == exactNumberOfDuplications && interimArray[i] != null) {
                    while (counter > 0) {
                        index = i + exactNumberOfDuplications - counter;
                        interimArray[index] = null;
                        counter--;
                    }
                }
        }

        getNewArrayLength(interimArray);
        result = buildNewArray(interimArray);

        if (result.length == array.length) return array; // no changes

        return result;
    }

    private Integer[] buildNewArray(Integer [] arrayNew){
        Integer [] temp = new Integer[array.length - newArrayLength];
        index = 0;
        for (int i = 0; i < array.length; i++){
            if (arrayNew[i] != null){
                temp[index] = arrayNew[i];
                index++;
            }
        }
        return temp;
    }

    private void checkForDuplicates (Integer element, Integer [] arrayNew){
        for (Integer eachElement : arrayNew) {
            if (eachElement == element && eachElement != null) {
                counter++;
            }
        }
    }

    private void getNewArrayLength(Integer [] arrayNew) {
        for (Integer eachElement : arrayNew) {
            if (eachElement == null) newArrayLength ++;
        }

    }


}
