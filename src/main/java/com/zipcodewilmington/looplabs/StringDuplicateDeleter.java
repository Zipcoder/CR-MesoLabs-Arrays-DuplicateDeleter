package com.zipcodewilmington.looplabs;
import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {

        super(intArray);
    }

    @Override

    public String[] removeDuplicates(int maxDuplications) {

        String theRealest = "";
        int counter = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    counter++;
                }
            }

            if (counter < maxDuplications) {
                theRealest += this.array[i] + " ";
            }

            counter = 0;
        }
        if (theRealest.length() < 1){
            String[] emptyString = new String[]{};
            return emptyString;
        }
        String[] resultStringArray = theRealest.split(" ");
        return resultStringArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactDuplications) {

        String theRealest = "";
        int counter = 0;

        for (int i = 0; i < this.array.length; i++) {
            for (int k = 0; k < this.array.length; k++) {

                if (this.array[i].equals(this.array[k])) {
                    counter++;
                }
            }

                if (counter != exactDuplications) {
                    theRealest += this.array[i] + " ";
            }

            counter = 0;
        }

        String[] resultStringArray = theRealest.split(" ");
      //  String[] resultIntArray = new String[resultStringArray.length];

     //   for (int m = 0; m < resultIntArray.length; m++) {
     //       resultIntArray[m] = Integer.parseInt(resultStringArray[m]);
     //   }

        return resultStringArray;
    }
}


// the basket..

