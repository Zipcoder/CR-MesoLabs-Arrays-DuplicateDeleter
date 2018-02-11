package com.zipcodewilmington.looplabs;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public  StringDuplicateDeleter (String[] StringArray){
        super(StringArray);
    }
    public String[] removeDuplicates(int maxNumberOfDuplications){

        return null;
    }


    public String[] removeDuplicatesExactly(int exactNumberOfDuplications){

        System.out.println(Arrays.toString(this.array));
        return this.array;
    }
}