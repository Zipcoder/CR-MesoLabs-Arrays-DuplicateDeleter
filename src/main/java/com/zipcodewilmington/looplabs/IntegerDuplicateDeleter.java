package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
    Integer[] myCopyOfArray = Arrays.copyOf(this.array, this.array.length);

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] toBeRemoved = new Integer[0];
        int toBeRemovedIndex = 0;
        for (int s : myCopyOfArray) {
            if (checkExistence(toBeRemoved, s)) {
                continue;
            } else if (getNumberOfOccurrences(myCopyOfArray, s) >= maxNumberOfDuplications) {
                toBeRemoved = Arrays.copyOf(toBeRemoved, toBeRemoved.length + 1);
                toBeRemoved[toBeRemovedIndex] = s;
                toBeRemovedIndex++;
            }

        }
        int resultIndex = 0;
        Integer[] resultArray = Arrays.copyOf(myCopyOfArray, myCopyOfArray.length);

        for (int r = 0; r < toBeRemoved.length; r++) {
            resultArray = deleter(resultArray, toBeRemoved[r]);
            }
            return resultArray;
        }


        @Override
        public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
            Integer[] toBeRemoved = new Integer[0];
            int toBeRemovedIndex = 0;
            for (int s : myCopyOfArray) {
                if (checkExistence(toBeRemoved, s)) {
                    continue;
                } else if (getNumberOfOccurrences(myCopyOfArray, s) == exactNumberOfDuplications) {
                    toBeRemoved = Arrays.copyOf(toBeRemoved, toBeRemoved.length + 1);
                    toBeRemoved[toBeRemovedIndex] = s;
                    toBeRemovedIndex++;
                }

            }
            int resultIndex = 0;
            Integer[] resultArray = Arrays.copyOf(myCopyOfArray, myCopyOfArray.length);

            for (int r = 0; r < toBeRemoved.length; r++) {
                resultArray = deleter(resultArray, toBeRemoved[r]);
                System.out.println(resultArray);
            }
            return resultArray;
        }

        public static int getNumberOfOccurrences(Integer[] array, Integer value) {

                int counter = 0;
                for(int i=0;i<array.length;i++){
                        if(array[i]==value){
                                counter++;
                        }
                }
                return counter;
        }
        public static Integer[] deleter(Integer[] array, Integer valueToRemove) {
                int counter =getNumberOfOccurrences(array, valueToRemove);
                Integer[] valuesToKeep = new Integer[array.length];
                for(int i=0;i<array.length;i++){
                        if(!valueToRemove.equals(array[i]))
                        {
                                valuesToKeep[i]=array[i];

                        }
                }

                //Resizing the valuesToKeep array by getting rid of the null values.
                Integer[] resultArray = new Integer[array.length-counter];
                int resultArrayIndex=0;

                for(Integer element: valuesToKeep){

                        if(element!=null){
                                resultArray[resultArrayIndex]=element;
                                resultArrayIndex++;
                        }


                }

                return resultArray;
        }

        public static boolean checkExistence(Integer[] array, Integer checkElement){
                for(Integer element: array){
                        if(checkElement.equals(element)){
                                return true;
                        }
                }
                return false;
        }

}