package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray){
        super(intArray);
    }
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        StringBuilder dupes = new StringBuilder();
        int dupeCount = 0;
        for(int i = 0; i < this.array.length; i++) {
            for(int j = 0; j < this.array.length; j++) {
                if(this.array[i].equals(this.array[j])){
                    dupeCount++;
                }
            }
            if(!(dupeCount >= maxNumberOfDuplications)) {
                dupes.append(this.array[i]);
            }
            dupeCount = 0;
        }
        String[] dupesRemoved = dupes.toString().split("");
        Integer[] toIntegers = new Integer[dupesRemoved.length];
        if(!dupesRemoved[0].equals("")) {
            for (int i = 0; i < dupesRemoved.length; i++) {
                toIntegers[i] = Integer.parseInt(dupesRemoved[i]);
            }
            return toIntegers;
        } else {
            Integer[] nothing = new Integer[0];
            return nothing;
        }
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        StringBuilder dupes = new StringBuilder();
        int dupeCount = 0;
        for(int i = 0; i < this.array.length; i++) {
            for(int j = 0; j < this.array.length; j++) {
                if(this.array[i].equals(this.array[j])){
                    dupeCount++;
                }
            }
            if(!(dupeCount == exactNumberOfDuplications)) {
                dupes.append(this.array[i]);
            }
            dupeCount = 0;
        }
        String[] dupesRemoved = dupes.toString().split("");
        Integer[] toIntegers = new Integer[dupesRemoved.length];

        for(int i = 0; i < dupesRemoved.length; i++) {
            toIntegers[i] = Integer.parseInt(dupesRemoved[i]);
        }

        return toIntegers;
    }

}
