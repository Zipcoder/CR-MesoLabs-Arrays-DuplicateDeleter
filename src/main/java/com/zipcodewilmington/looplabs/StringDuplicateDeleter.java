package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    private int counter = 0;
    private int index = 0;
    private int newArrayLength = 0;


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] interimArray = new String[array.length];
        System.arraycopy(array,0,interimArray,0,array.length);
        newArrayLength = 0;
        String [] result;
        String temp;

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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] interimArray = new String[array.length];
        System.arraycopy(array,0,interimArray,0,array.length);
        String [] result;
        newArrayLength = 0;
        for (int i = 0; i < array.length -1; i++) {
            counter = 0;
            checkForDuplicates(interimArray[i],interimArray);

            if (counter == exactNumberOfDuplications && interimArray[i] != null) {
                //newArrayLength += counter;
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

    private String[] buildNewArray(String [] arrayNew){
        String [] temp = new String[array.length - newArrayLength];
        index = 0;
        for (int i = 0; i < array.length; i++){
            if (arrayNew[i] != null){
                temp[index] = arrayNew[i];
                index++;
            }
        }
        return temp;
    }

    private void checkForDuplicates (String element, String  [] arrayNew){
        for (String eachElement : arrayNew) {
            if (eachElement == element && eachElement != null) {
                counter++;
            }
        }
    }

    private void getNewArrayLength(String [] arrayNew) {
        for (String eachElement : arrayNew) {
            if (eachElement == null) newArrayLength ++;
        }

    }
}
