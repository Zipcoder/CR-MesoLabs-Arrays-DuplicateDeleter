package com.zipcodewilmington.looplabs;



/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }


    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        String counter = "";
        String buffArray = "";
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                counter += i;
                if (i == array.length - 2) {
                    counter += (array[i + 1]);
                }
            } else if (!(array[i].equals(array[i + 1]))) {
                if (counter.length() >= maxNumberOfDuplications) {
                    counter = "";
                } else if (i == array.length - 2) {
                    counter += (array[i + 1]);
                }
                for (int j = 0; j < counter.length(); j++) {
                    buffArray += (counter.indexOf(j));
                }
                counter += "";
            }
        }
        String[] newArray = buffArray.split("");
        for(String i : newArray) System.out.println(i);
        Integer[] revArray = new Integer[newArray.length];
        for (int i = 0; i < buffArray.length(); i++){
            revArray[i] = Integer.valueOf(newArray[i]);
        }
        return revArray;
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String counter = "";
        String buffArray = "";
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = i+1; j < array.length-1; j++){
                if (array[i].equals(array[j])) {
                    counter += (array[j] + " ");
                }
                else if (!(array[i].equals(array[j]))){
                    counter += (array[i] + " ");
                    buffArray += counter;
                    counter = "";
                    i = j;
                    j = (i+1);
                    break;
                }
            }
        }
        String[] beforeConv = buffArray.split(" ");
        int nullCount = 0;
        for(String num: beforeConv){
            if (num == null){
                nullCount++;
            }
        }
        Integer[] revArray = new Integer[beforeConv.length - nullCount];
        for (int i = 0; i < beforeConv.length; i++) {
            revArray[i] = Integer.getInteger(beforeConv[i]);
            System.out.println(revArray[i]);
            System.out.println(beforeConv[i]);
        }


        return revArray;
    }
}