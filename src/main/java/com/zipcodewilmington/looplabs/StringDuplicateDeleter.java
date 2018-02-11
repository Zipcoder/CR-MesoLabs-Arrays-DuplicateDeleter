package com.zipcodewilmington.looplabs;
import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter (String[] stringArray) {
        super(stringArray);
    }

    public String[] removeDuplicates  (int maxNumberOfDuplications){
        String[] finalStringArray = this.array;
        String[] toDelete = new String[0];
        String[] blankArray = new String[0];
        int deleteCounter =0;
        for(String s  : this.array){
            if (containsTimes(this.array, s) >= maxNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = s;
                deleteCounter++;
            }
        }
        for(String s : toDelete){
            finalStringArray = delete(finalStringArray, blankArray, s);
        }
        return finalStringArray;
    }


    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){
        String[] finalStringArray = this.array;
        String[] toDelete = new String[0];
        String[] blankArray = new String[0];
        int deleteCounter =0;
        for(String s  : this.array){
            if (containsTimes(this.array, s) == exactNumberOfDuplications){
                toDelete = Arrays.copyOf(toDelete, toDelete.length+1);
                toDelete[deleteCounter] = s;
                deleteCounter++;
            }
        }
        for(String s : toDelete){
            finalStringArray = delete(finalStringArray, blankArray, s);
        }
        return finalStringArray;
    }
}
