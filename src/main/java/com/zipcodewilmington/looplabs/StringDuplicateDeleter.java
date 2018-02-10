package com.zipcodewilmington.looplabs;

//import com.sun.org.apache.xpath.internal.operations.String;

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
        StringBuilder duplicates = new StringBuilder();
        int dupeCounter = 0;
        if (maxNumberOfDuplications == 0 || maxNumberOfDuplications == 1){
            return new String[0];
        }
        for (int i = 0; i < this.array.length; i++){
            for (int j = 0; j < this.array.length; j++){
                if (this.array[i].equals(this.array[j])){
                    dupeCounter++;
                }
            }
            System.out.println(dupeCounter);
            if (!(dupeCounter >= maxNumberOfDuplications)){
                duplicates.append(this.array[i] + ",");
            } dupeCounter = 0;
        }
        System.out.println(duplicates);

        return duplicates.toString().split(",");
    }



    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder duplicates = new StringBuilder();
        int dupeCounter = 0;
        for (int i = 0; i < this.array.length; i++){
            for (int j = 0; j < this.array.length; j++){
                if (this.array[i].equals(this.array[j])){
                    dupeCounter++;
                }
            }
            System.out.println(dupeCounter);
            if (!(dupeCounter == exactNumberOfDuplications)){
                duplicates.append(this.array[i] + ",");
            } dupeCounter = 0;
        }
        System.out.println(duplicates);

        return duplicates.toString().split(",");
    }
}