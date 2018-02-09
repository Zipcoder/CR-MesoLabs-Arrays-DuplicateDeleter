package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
    /*    StringBuilder removedString = new StringBuilder();
        int dupeCount = 0;
        for (int count = 0; count < this.array.length; count++) {
            for (int count2 = 0; count2 <this.array.length; count2++) {
                if (this.array[count].equals(this.array[count2])) {
                    dupeCount++;
                }
            }
            if (!(dupeCount == exactNumberOfDuplications)) {
                removedString.append(this.array[count]);
            }
            dupeCount = 0;

        }
        String[] removedStringArray = removedString.toString().split("");
        if (!removedStringArray[0].equals("")) {

            Integer[] intArray = new Integer[removedStringArray.length];
            for (int count = 0; count < intArray.length; count++) {
                intArray[count] = Integer.parseInt(removedStringArray[count]);
            }

            return intArray;
        } else {
            Integer[] empty = new Integer[0];
            return empty;
        } */
        String[] stringArray = new String[this.array.length];
        for (int count = 0; count < this.array.length; count++) {
            stringArray[count] = this.array[count].toString();
        }

        StringDuplicateDeleter stringDD = new StringDuplicateDeleter(stringArray);
        String[] stringDD2 = stringDD.removeDuplicatesExactly(exactNumberOfDuplications);


        Integer[] intArray = new Integer[stringDD2.length];
        for (int count = 0; count < intArray.length; count++) {
            intArray[count] = Integer.parseInt(stringDD2[count]);
        }
        return intArray;
    }



    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
       /* StringBuilder removedString = new StringBuilder();
        int dupeCount = 0;
        for (int count = 0; count < this.array.length; count++) {
            for (int count2 = 0; count2 <this.array.length; count2++) {
                if (this.array[count].equals(this.array[count2])) {
                    dupeCount++;
                }
            }
            if (!(dupeCount >= maxNumberOfDuplications)) {
                removedString.append(this.array[count]);
            }
            dupeCount = 0;

        }
        String[] removedStringArray = removedString.toString().split("");
        if (!removedStringArray[0].equals("")) {

            Integer[] intArray = new Integer[removedStringArray.length];
            for (int count = 0; count < intArray.length; count++) {
                intArray[count] = Integer.parseInt(removedStringArray[count]);
            }

            return intArray;
        } else {
            Integer[] empty = new Integer[0];
            return empty;
        }
    } */
        String[] stringArray = new String[this.array.length];
        for (int count = 0; count < this.array.length; count++) {
            stringArray[count] = this.array[count].toString();
        }

        StringDuplicateDeleter stringDD = new StringDuplicateDeleter(stringArray);
        String[] stringDD2 = stringDD.removeDuplicates(maxNumberOfDuplications);


        Integer[] intArray = new Integer[stringDD2.length];
        for (int count = 0; count < intArray.length; count++) {
            intArray[count] = Integer.parseInt(stringDD2[count]);
        }
        return intArray;
    }
}
