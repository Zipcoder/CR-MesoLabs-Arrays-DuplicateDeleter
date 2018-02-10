package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder sb = new StringBuilder();

        int counter = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }

            if (!(counter == exactNumberOfDuplications)) {
                sb.append(this.array[i]);
            }
            counter = 0;
        }
    String [] removedDupArray = sb.toString().split("");

    Integer[] sbArray = new Integer[removedDupArray.length];


    if (!removedDupArray[0].equals("")){

            for (int i = 0; i < sbArray.length; i++){
                sbArray[i] = Integer.parseInt(removedDupArray[i]);
            }

            return sbArray;

        } else {
            Integer[] empty = new Integer[0];
            return empty;
        }





    }

        @Override
        public Integer[] removeDuplicates (int maxNumberOfDuplications){
            StringBuilder sb = new StringBuilder();

            int counter = 0;

            for (int i = 0; i < this.array.length; i++) {
                for (int j = 0; j < this.array.length; j++) {
                    if (this.array[i].equals(this.array[j])) {
                        counter++;
                    }
                }

                if ((counter < maxNumberOfDuplications)) {
                    sb.append(this.array[i]);
                }
                counter = 0;
            }
            String [] removedDupArray = sb.toString().split("");

            Integer[] sbArray = new Integer[removedDupArray.length];


            if (!removedDupArray[0].equals("")){

                for (int i = 0; i < sbArray.length; i++){
                    sbArray[i] = Integer.parseInt(removedDupArray[i]);
                }

                return sbArray;

            } else {
                Integer[] empty = new Integer[0];
                return empty;
            }
        }

    }
