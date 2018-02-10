package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);


    }


    /**
     * // remove duplicates return new array;
     *
     * @param maxNumberOfDuplications
     * @return
     */
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 1;
        int sum = 0;
        int currentIndex = 0;

        // for each interger in the array remove max number of the duplications;
        Integer[] numbers = this.array;
        Integer[][] keyValue = new Integer[numbers.length][2]; // if its too big it will run into null values
        Integer temp[] = new Integer[2];

        Arrays.sort(numbers); /*sorts the array of Intergers numbers*/
       //printMethod(numbers);
        /**add the size the number to array of times it occurs;*/
        for (int i = 0; i <= numbers.length -1; i++) {
            if ( i == numbers.length -1){
                temp[0] = numbers[i];
                temp[1] = count;
                //printMethod(temp);//keyValue = Arrays.copyOf(keyValue, count + currentIndexInKeyValue);
                keyValue[currentIndex][0] = temp[0];
                keyValue[currentIndex][1] = temp[1];
                sum += count;// counts indexs needed for smaller array.
                count = 1;//reset tally of
            }

            if (i < numbers.length -1 && numbers[i] == numbers[i + 1]) {

                count++;

            }
            if (i < numbers.length -1 && numbers[i] != numbers[i + 1] /* && count <= maxNumberOfDuplications*/) {
                temp[0] = numbers[i];
                temp[1] = count;
                //printMethod(temp);//keyValue = Arrays.copyOf(keyValue, count + currentIndexInKeyValue);
                keyValue[currentIndex][0] = temp[0];
                keyValue[currentIndex][1] = temp[1];
                sum += count;// counts indexs needed for smaller array.
                currentIndex++;
                count = 1;
            }
        }
        //printDoubleArray(keyValue);



        int key = 0;
        int value = 0;
        currentIndex = 0;
        Integer[] tempHold =  new Integer[sum];
        Integer[] result = new Integer[sum];
        /** take key value pairs and spit out the array of Intergers*/
        for (int i = 0; i < keyValue.length ; i++) {
            for (int j = 0; j < keyValue[i].length; j++) {
                // enter key in the array the amount = value consecutivly.
                if (j == 0) {
                    key = keyValue[i][j];
                 continue;
                }
                    value = keyValue[i][j];
                   // printInt(value);
                tempHold = copyArray(key, value);// change nae of result
                 //printMethod(tempHold);
                  if(i == 0){
                      System.arraycopy(tempHold, 0, result, 0 ,  value);
                printMethod(result);
                  }
                if(keyValue != null){

                      System.arraycopy(tempHold, 0, result, sum  +1, value);
                  }

                 sum += value;
            }
        }
        return result;
    }

//    public int countNumbers(Integer [] count){
//            return null;
//        }
    public void printMethod(Integer [] something){
        for(Integer i: something){
            System.out.println(i.toString());
        }
    }
    public void printDoubleArray(Integer [][] something){
        String s = "";
        for(int i =0; i < something.length ; i++){
            for(int j = 0; j < something[i].length; j++ )
         s += something[i][j] + ",";
            System.out.println("[" + s  +"]");
        }
    }
    public void printInt(int something){ ;
            System.out.println(something);
        }

    /**
     * fills an array full the same number up to number of that is equal to value
     *
     * @param key   the number to add to each index
     * @param value the number of times the key is to be added to array.
     * @return
     */
    public Integer[] copyArray(int key, int value) {
        Integer[] copy = new Integer[value];
        for (int i = 0; i < value; i++) {
            copy[i] = key;
        }
        return copy;
    }

    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        // for each interger in the array remove max number of the duplications;
        Integer[] someNumers = this.array;
        Integer[] exactRemoved = new Integer[0];
        int count = 0;
        int max = 0;
        /*sorts the array of Intergers numbers*/
        Arrays.sort(someNumers);
        for (Integer n : someNumers) {
            System.out.println(n.toString());
        }

        for (int i = 1; i < someNumers.length - 1; i++) {
            exactRemoved = Arrays.copyOf(exactRemoved, count + 1);
            if (exactRemoved[i] == someNumers[i + 1] && max != exactNumberOfDuplications) {
                exactRemoved[count] = someNumers[i];

                count++;
                max++;
            }
            exactRemoved[count] = someNumers[i];
        }
        return exactRemoved;
    }
}