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
        //counters
        int numberBeingObserved;
        int freqOfNumObserved = 0;
        int counterForBuffArr = 0;
        Integer[] bufferArray = new Integer[array.length*2];
        for (int i = 0; i < array.length - 1; i++) {
            numberBeingObserved = array[i];
            for(int j = i+1; j < array.length-1; j++){
                if (array[i].equals(array[j])) {
                    freqOfNumObserved++;
                }
                else if (!(array[i].equals(array[j]))){
                    if (freqOfNumObserved == exactNumberOfDuplications){
                        freqOfNumObserved = 0;
                        numberBeingObserved = 0;
                        i = j;
                        j = (i+1);
                        continue;
                    }
                    //fill the buffer array with info
                    for(int k = freqOfNumObserved; k > 0; k--){
                        bufferArray[counterForBuffArr] = numberBeingObserved;
                        System.out.println(bufferArray[i]+ "\n");
                        counterForBuffArr++;
                    }
                    i = j;
                    j = (i+1);
                    break;
                }
            }
        }
        int nullCount = 0;
        for(Integer num: bufferArray){
            if (num == null){
                nullCount++;
            }
        }
        Integer[] revArray = new Integer[bufferArray.length - nullCount];
        for (int i = 0; i < bufferArray.length; i++) {
            revArray[i] = bufferArray[i];
            System.out.println(revArray[i]);
            System.out.println(bufferArray[i]);
        }


        return revArray;
    }
}