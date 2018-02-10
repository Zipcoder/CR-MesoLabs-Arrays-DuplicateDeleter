package com.zipcodewilmington.looplabs;

//import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications){
        StringBuilder packedString = new StringBuilder();
        stringPacker(packedString);
        StringBuilder eventualAnswer = new StringBuilder();
        String[] splitPackedString = packedString.toString().split(" ");
        //remove elements with a size bigger than maxNumberOfDuplications, then spit that result out into a string of every number individually.
        eventualAnswerCreator(exactNumberOfDuplications, eventualAnswer, splitPackedString);
        Integer[] finalArrayAnswer = new Integer[eventualAnswer.length()];
        //if done right, this SHOULD be an imdepotent solution
        //Integer[] arrayOfEventualAnswer = eventualAnswer.split;
        System.out.println("line 36 " + eventualAnswer.toString());
        if (emptyArrayAnswerChecker(eventualAnswer)) return new Integer[0];
        finalArrayAnswerMaker(eventualAnswer, finalArrayAnswer);
        return finalArrayAnswer;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        StringBuilder packedString = new StringBuilder();
        stringPacker(packedString);
        StringBuilder eventualAnswer = new StringBuilder();
        String[] splitPackedString = packedString.toString().split(" ");
        //remove elements with a size bigger than maxNumberOfDuplications, then spit that result out into a string of every number individually.
        eventualAnswerCreator(maxNumberOfDuplications, eventualAnswer, splitPackedString);
        Integer[] finalArrayAnswer = new Integer[eventualAnswer.length()];
        
        //if done right, this SHOULD be an imdepotent solution
        //Integer[] arrayOfEventualAnswer = eventualAnswer.split;
        System.out.println("line 36 " + eventualAnswer.toString());
        if (emptyArrayAnswerChecker(eventualAnswer)) return new Integer[0];
        finalArrayAnswerMaker(eventualAnswer, finalArrayAnswer);
        return finalArrayAnswer;
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
        System.out.println("line ~50 " + packedString);
    }

    private void eventualAnswerCreator(int maxNumberOfDuplications, StringBuilder eventualAnswer, String[] splitPackedString) {
        for (String element:splitPackedString) {
            if (element.length() < maxNumberOfDuplications){
                eventualAnswer.append(element);
            }
        }
    }

    private void eventualExactAnswerCreator(int exactNumberOfDuplications, StringBuilder eventualAnswer, String[] splitPackedString) {
        for (String element:splitPackedString) {
            if (element.length() < exactNumberOfDuplications){
                eventualAnswer.append(element);
            }
        }
    }

    private boolean emptyArrayAnswerChecker(StringBuilder eventualAnswer) {
        if (eventualAnswer.length() == 0){
            return true;
        }
        return false;
    }

    private void finalArrayAnswerMaker(StringBuilder eventualAnswer, Integer[] finalArrayAnswer) {
        String[] nextToFinalArray = eventualAnswer.toString().split("");
        for (int g = 0; g < nextToFinalArray.length; g++) {
            finalArrayAnswer[g] = Integer.parseInt(nextToFinalArray[g]);
        }
    }

    /**     if (this.array[i].equals(this.array[i-maxNumberOfDuplications])){
     *          range of this.array[i] to this.array[i-maxNumberOfDuplications] are set to null
     System.out.println("IM DOING A NULL");
     }
     this will not actually work, it'll remove it if you give an exact number of instances it can't be, and want to delete more of those instances. but it won't delete more than that.
     */



}
