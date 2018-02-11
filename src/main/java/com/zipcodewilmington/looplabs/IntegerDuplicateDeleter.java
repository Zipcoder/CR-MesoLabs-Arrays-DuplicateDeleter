package com.zipcodewilmington.looplabs;


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
        String counter = "";
        String buffArray = "";
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                counter += i;
                if (i == array.length - 2) {
                    counter += (array[i + 1]);
                }
            } else if (!(array[i].equals(array[i + 1]))) {
                if (counter.length() >= maxNumberOfDuplications) {
                    counter = "";
                } else if (i == array.length - 2) {
                    counter += (array[i + 1]);
                }
                for (int j = 0; j < counter.length(); j++) {
                    buffArray += (counter.indexOf(j));
                }
                counter += "";
            }
        }
        String[] newArray = buffArray.split("");
        for (String i : newArray) System.out.println(i);
        Integer[] revArray = new Integer[newArray.length];
        for (int i = 0; i < buffArray.length(); i++) {
            revArray[i] = Integer.valueOf(newArray[i]);
        }
        return revArray;
    }











    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        //counters
        int counterForOcc = 0;
        int countForHowManyInts = 1;

        //counting how many different ints there are
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                countForHowManyInts++;
            }
        }

        //array to hold int and instances
        Integer[][] numsAndOcc = new Integer[countForHowManyInts][2];

        int counterForNumsInstances = 0;
        //filling int into first column
        numsAndOcc[0][0] = array[0];
        counterForOcc = 0;
        for (int i = 1; i < array.length; i++) {
            if (!(array[i].equals(array[i - 1]))) {
                numsAndOcc[counterForOcc][0] = array[i];
                counterForOcc++;
                System.out.println(numsAndOcc[counterForOcc][0]);
            }
        }

        //filling intsances
        numsAndOcc[0][1] = 1;
        for (int i = 1; i < array.length; i++) {
            counterForOcc = 0;
                if (array[i].equals(array[i-1])) {
                    counterForOcc++;
                }
                if (!array[i].equals(array[i-1])) {
                    numsAndOcc[counterForNumsInstances][1] += counterForOcc;
                    counterForNumsInstances++;
                    //System.out.println(numsAndOcc[counterForNumsFirstIndex][1]);
                }
        }


        //counting bad numbers
        int countForBadNums = 0;
        counterForOcc = 0;
        for (int i = 0; i < numsAndOcc.length; i++) {
            if (numsAndOcc[i][1] == exactNumberOfDuplications) {
                countForBadNums += numsAndOcc[i][1];
                numsAndOcc[i][1] = 0;

            }
            counterForOcc += numsAndOcc[i][1];
        }



        //filling output array
        Integer[] revArray = new Integer[counterForOcc - countForBadNums];
        int counterForRevArray = 0;
        for (int i = 0; i < revArray.length; i++) {
            for (int j = numsAndOcc[i].length; j > 0; j--) {
                revArray[counterForRevArray] = numsAndOcc[i][0];
                counterForRevArray++;
                for (Integer num : revArray) System.out.println(num);

            }
        }
        return revArray;
    }
}