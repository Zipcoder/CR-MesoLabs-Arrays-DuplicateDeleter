package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }
         String[] myCopyOfArray = Arrays.copyOf(this.array,this.array.length);

    /**
     *
     * @param maxNumberOfDuplications
     * @return
     */
    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] outPut = new String[0];
        int outPutIndex = 0;
        for (String s : myCopyOfArray) {

           if(getNumberOfOccurrences(myCopyOfArray, s)< maxNumberOfDuplications) {
                outPut = Arrays.copyOf(outPut, outPut.length+1);
                outPut[outPutIndex] = s;
                outPutIndex++;
            }
        }

        return outPut;
    }
    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] outPut = new String[0];
        int outPutIndex = 0;
        for (String s : myCopyOfArray) {
            if (getNumberOfOccurrences(myCopyOfArray, s) != exactNumberOfDuplications) {
                outPut = Arrays.copyOf(outPut, outPut.length+1);
                outPut[outPutIndex] = s;
                outPutIndex++;
            }

        }
        return outPut;
    }

    public static int getNumberOfOccurrences(String[] array, String value) {

              int counter = 0;
               for(int i=0;i<array.length;i++){
                       if(array[i].equalsIgnoreCase(value)){
                              counter++;
                          }
                  }
              return counter;
    }

}
