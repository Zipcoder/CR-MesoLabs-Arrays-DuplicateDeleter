package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }


    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int k=0;
        String[]arr=new String[array.length];
        for(int i= 0;i<array.length;i++){
            if(getOccurences(array[i])<maxNumberOfDuplications){
                arr[k]=(array[i]);
                k++;
            }


        }
        int counterNull=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                counterNull++;
            }

        }
       String[] filtered=new String[arr.length-counterNull];
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                filtered[m]=(arr[i]);
                m++;
            }
        }
        System.out.println(filtered);
        return  filtered;
    }




    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int k=0;
        String[]arr=new String[array.length];
        for(int i= 0;i<array.length;i++){
            if(getOccurences(array[i])!=(exactNumberOfDuplications)){
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
        String[] filtered=new String[arr.length-counterNull];
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

    public int getOccurences( String objectToCount) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

}
