package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);


    }


    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int k=0;
        Integer[]arr=new Integer[array.length];
        for(int i= 0;i<array.length;i++){
       if(getOccurences(array[i])<maxNumberOfDuplications){
          arr[k]=array[i];
          k++;
          }


       }
        int counterNull=0;
        for(int i=0;i<arr.length;i++){
       if(arr[i]==null){
           counterNull++;
       }

}
        Integer[] filtered=new Integer[arr.length-counterNull];
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                filtered[m]=arr[i];
                m++;
            }
        }
        System.out.println(filtered);
        return  filtered;
    }


    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int k=0;
        Integer[]arr=new Integer[array.length];
        for(int i= 0;i<array.length;i++){
            if(getOccurences(array[i])!=exactNumberOfDuplications){
                arr[k]=array[i];
                k++;
            }


        }
        int counterNull=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                counterNull++;
            }

        }
        Integer[] filtered=new Integer[arr.length-counterNull];
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                filtered[m]=arr[i];
                m++;
            }
        }
        System.out.println(filtered);
        return  filtered;
    }





    public int getOccurences( int objectToCount) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == objectToCount) {
                count++;
            }
        }
        return count;
    }


}
