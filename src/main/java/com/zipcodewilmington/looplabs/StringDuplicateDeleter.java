package com.zipcodewilmington.looplabs;

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
        StringBuilder taco = new StringBuilder();

        for (String loopingTaco : array) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                String comparingTaco = array[i];
                if (loopingTaco == comparingTaco)
                    count++;
            }

            if (count < maxNumberOfDuplications) {
                taco.append(loopingTaco);
                taco.append(" ");
            }
        }

        String[] firstTry = taco.toString().split(" ");
        if(taco.toString().isEmpty()){
            return new String[0];
        }
        String[] secondTry = new String[firstTry.length];
        for (int i = 0; i < firstTry.length; i++) {
            if(!firstTry[i].isEmpty()) {
                secondTry[i] = new String(firstTry[i]);
            }

        }
        return secondTry;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder taco = new StringBuilder();

        for (String tacoString : array) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                String tacoBeingCompared = array[i];
                if (tacoString == tacoBeingCompared)
                    count++;
            }

            if (count != exactNumberOfDuplications) {
                taco.append(tacoString);
                taco.append(" ");
            }
        }

        String[] firstString = taco.toString().split(" ");
        String[] secondString = new String[firstString.length];
        for (int i = 0; i < firstString.length; i++) {
            secondString[i] = new String(firstString[i]);

        }

        return secondString;

    }
}
