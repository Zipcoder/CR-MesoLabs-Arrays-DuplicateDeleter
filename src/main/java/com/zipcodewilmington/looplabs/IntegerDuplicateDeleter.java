package com.zipcodewilmington.looplabs;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        //dupeCount increments as for loop crawls array
        //i starts at = maxNumberOfDuplications
        //MAXNUMBEROFDUPLICATIONS IS A NON INCLUSIVE CEILING
        //if dupeCount equals maxNumberOfDuplications, set everything from i to i-maxNumberOfDuplications to null
        //CHAR AT FIRST AND FINAL INSTANCE, REMOVE RANGE OF THOSE INDICES
        //if ((charAt(finalInstance) - charAt(firstInstance) >= maxNumberOfDuplications, remove them all
        //or, use stringbuilder and filter with delimiters, like we did with the pack lab. then do our regex indexOf crawl and subtraction
        StringBuilder packedString = new StringBuilder();
        stringPacker(packedString);
        if (int j = 0; j < packedString.)
        if ((packedString.lastIndexOf("0") - packedString.indexOf("0")) >= maxNumberOfDuplications){
            packedString.delete(packedString.indexOf("0"), packedString.lastIndexOf("0") + 2);
            System.out.println(packedString);
        }
        return new Integer[0];
    }
    //ayyyy srplmao
    private void stringPacker(StringBuilder packedString) {
        packedString.append(this.array[0]);
        for (int i = 1; i < array.length; i++){
            if (array[i].equals(array[i-1])){
                packedString.append(array[i]);
            } else {
                packedString.append(" " + array[i]);
            }
        }
        System.out.println(packedString);
    }

    /**     if (this.array[i].equals(this.array[i-maxNumberOfDuplications])){
     *          range of this.array[i] to this.array[i-maxNumberOfDuplications] are set to null
                System.out.println("IM DOING A NULL");
            }
            this will not actually work, it'll remove it if you give an exact number of instances it can't be, and want to delete more of those instances. but it won't delete more than that.
     */

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        return new Integer[0];
    }

}
