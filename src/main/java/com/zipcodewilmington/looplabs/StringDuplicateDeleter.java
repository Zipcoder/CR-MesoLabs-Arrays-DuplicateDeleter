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

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] toBeRemoved = new String[0];
        int toBeRemovedIndex = 0;
        for (String s : myCopyOfArray) {
            if (checkExistence(toBeRemoved,s)) {
                continue;
            } else if (getNumberOfOccurrences(myCopyOfArray, s)>= maxNumberOfDuplications) {
                toBeRemoved = Arrays.copyOf(toBeRemoved, toBeRemoved.length+1);
                toBeRemoved[toBeRemovedIndex] = s;
                toBeRemovedIndex++;
            }

        }

        String[] resultArray = Arrays.copyOf(myCopyOfArray, myCopyOfArray.length);
        for (int r = 0; r < toBeRemoved.length; r++) {
            resultArray = deleter(resultArray, toBeRemoved[r]);
        }
        return resultArray;
    }
    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] toBeRemoved = new String[0];
        int toBeRemovedIndex = 0;
        for (String s : myCopyOfArray) {
            if (checkExistence(toBeRemoved,s)) {
                continue;
            } else if (getNumberOfOccurrences(myCopyOfArray, s) == exactNumberOfDuplications) {
                toBeRemoved = Arrays.copyOf(toBeRemoved, toBeRemoved.length+1);
                toBeRemoved[toBeRemovedIndex] = s;
                toBeRemovedIndex++;
            }

        }

        String[] resultArray = Arrays.copyOf(myCopyOfArray, myCopyOfArray.length);
        for (int r = 0; r < toBeRemoved.length; r++) {
                resultArray= deleter(resultArray, toBeRemoved[r]);
        }
        return resultArray;
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
    public static String[] deleter(String[] array, String valueToRemove) {
        int counter =getNumberOfOccurrences(array, valueToRemove);
        String[] valuesToKeep = new String[array.length];
        for(int i=0;i<array.length;i++){
            if(!(array[i].equals(valueToRemove)))
            {
                valuesToKeep[i]=array[i];

            }
        }
        String[] resultArray = new String[array.length-counter];
        int resultArrayIndex=0;

        for( String element: valuesToKeep){

            if(element!=null){
                resultArray[resultArrayIndex]=element;
                resultArrayIndex++;
            }


        }

        return resultArray;
    }

    public static boolean checkExistence(String[] array, String checkElement){
        for(int a=0;a<array.length;a++){
            if(checkElement.equals(array[a])){
                return true;
            }
        }
        return false;
    }


}
