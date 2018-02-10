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

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int dupeCounter = 0;
        StringBuilder duplicates = new StringBuilder();
        if (removeAllZeroOneChecker(maxNumberOfDuplications)) return new String[0];
        removeStringBuilderBuilder(maxNumberOfDuplications, duplicates, dupeCounter);
        System.out.println(duplicates);
        return duplicates.toString().split(",");
    }

    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int dupeCounter = 0;
        StringBuilder duplicates = new StringBuilder();
        exactStringBuilderBuilder(exactNumberOfDuplications, duplicates, dupeCounter);
        System.out.println(duplicates);
        return duplicates.toString().split(",");
    }

    public void removeStringBuilderBuilder(int maxNumberOfDuplications, StringBuilder duplicates, int dupeCounter) {
        for (int i = 0; i < this.array.length; i++){
            dupeCounter = getDupeCounterOuter(dupeCounter, this.array[i]);
            System.out.println(dupeCounter);
            dupeCounter = dupeCounterMaxNumberChecker(duplicates, dupeCounter, i, dupeCounter >= maxNumberOfDuplications);
        }
    }

    public int getDupeCounterOuter(int dupeCounter, String s) {
        for (int j = 0; j < this.array.length; j++){
            dupeCounter = getDupeCounter(dupeCounter, s, this.array[j]);
        }
        return dupeCounter;
    }

    private int dupeCounterMaxNumberChecker(StringBuilder duplicates, int dupeCounter, int i, boolean b) {
        if (!(b)) {
            duplicates.append(this.array[i] + ",");
        }
        dupeCounter = 0;
        return dupeCounter;
    }

    public int getDupeCounter(int dupeCounter, String s, String anObject) {
        if (s.equals(anObject)){
            dupeCounter++;
        }
        return dupeCounter;
    }

    public boolean removeAllZeroOneChecker(int maxNumberOfDuplications) {
        if (maxNumberOfDuplications == 0 || maxNumberOfDuplications == 1){
            return true;
        }
        return false;
    }

    private void exactStringBuilderBuilder(int exactNumberOfDuplications, StringBuilder duplicates, int dupeCounter) {
        for (int i = 0; i < this.array.length; i++){
            dupeCounter = getDupeCounterOuter(dupeCounter, this.array[i]);
            System.out.println(dupeCounter);
            dupeCounter = dupeCounterMaxNumberChecker(duplicates, dupeCounter, i, dupeCounter == exactNumberOfDuplications);
        }
    }
}