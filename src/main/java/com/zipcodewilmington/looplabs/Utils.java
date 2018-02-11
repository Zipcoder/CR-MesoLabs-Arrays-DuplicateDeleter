package com.zipcodewilmington.looplabs;

public class Utils {

    public static void appender(int maxNumberOfDuplications, StringBuilder dupString, String currentString, int count) {
        if (count < maxNumberOfDuplications) {
            for (int i = 0; i < count; i++) {
                dupString.append(currentString + ",");
            }
        }
    }

    public static void appender(int maxNumberOfDuplications, StringBuilder dupString, int currentNumber, int count) {
        if (count < maxNumberOfDuplications) {
            for (int i = 0; i < count; i++) {
                dupString.append(currentNumber + ",");
            }
        }
    }

    public static boolean isMatch(String currentString, String currentIndex) {
        if (currentString.equals(currentIndex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMatch(int currentNumber, int currentIndex) {
        if (currentNumber == (currentIndex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isComplete(int currentIndex, int count, String[] array) {
        if (currentIndex + count == array.length) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean isComplete(int currentIndex, int count, Integer[] array) {
        if (currentIndex + count == array.length) {
            return true;

        } else {
            return false;
        }
    }

    public static void appendExact(int exactNumberOfDuplications, StringBuilder dupString, String currentString, int count) {
        if (count != exactNumberOfDuplications) {
            for (int i = 0; i < count; i++) {
                dupString.append(currentString + ",");
            }
        }
    }

    public static void appendExact(int exactNumberOfDuplications, StringBuilder dupString, int currentString, int count) {
        if (count != exactNumberOfDuplications) {
            for (int i = 0; i < count; i++) {
                dupString.append(currentString + ",");
            }
        }
    }

    public static int countMatches(int currentIndex, int count, String[] array, String currentString) {

        for(int i = currentIndex; i<array.length;i++){

            if (Utils.isMatch(currentString, array[i])) {
                count++;
            } else break;
        }
        return count;
    }

    public static int countMatches(int currentIndex, int count, Integer[] array, int currentNumber) {

        for(int i = currentIndex; i<array.length;i++){

            if (Utils.isMatch(currentNumber, array[i])) {
                count++;
            } else break;
        }
        return count;
    }

}