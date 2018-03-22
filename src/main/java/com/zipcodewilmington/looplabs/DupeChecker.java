package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class DupeChecker {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return getElement(array, 0);
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return getElement(array, 1);
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return getElement(array, array.length - 1);
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return getElement(array, array.length - 2);
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String entry : array) {
            if (entry.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        int i = array.length - 1;
        for (String entry : array) {
            reverse[i] = entry;
            --i;
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i <= array.length / 2; i++) {
            if (array[i] != array[array.length - (i + 1)]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String str = String.join("", array).toLowerCase();

        //Since characters contain unicode numberic values, we can increment them
        for (char c = 'a'; c <= 'z'; ++c) {
            if (!str.contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String entry : array) {
            if (entry == value) {
                ++count;
            }
        }
        return count;
    }

    public static int getNumberOfOccurrences(Integer[] array, Integer value) {
        int count = 0;
        for (Integer entry : array) {
            if (entry == value) {
                ++count;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = getNumberOfOccurrences(array, valueToRemove);
        System.out.println(count);
        String[] newArray = new String[array.length - count];

        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            if (j < newArray.length) {
                if (array[i] != valueToRemove) {
                    newArray[j] = array[i];
                    j++;
                }
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int count = getNumberOfUniqueEntries(array);
        String[] newArray = new String[count];

        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            if (j < count) {
                if (i == 0) {
                    newArray[j] = array[i];
                    j++;
                } else if (array[i] != array[i - 1]) {
                    newArray[j] = array[i];
                    j++;
                }
            } else {
                return newArray;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count = getNumberOfUniqueEntries(array);
        String[] newArray = new String[count];

        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                newArray[j] = array[i];
            } else if (array[i] == array[i - 1]) {
                newArray[j] += array[i];
            } else {
                j++;
                newArray[j] = array[i];
            }
        }
        return newArray;
    }

    private static String getElement(String[] array, int n) {
        return array[n];
    }

    private static int getNumberOfUniqueEntries(String[] array) {
        //Count for unique values. Start with one since the 0 index is guaranteed to be the first occurrence of a dup
        int count = 1;

        for (int i = 1; i < array.length; ++i) {
            if (array[i] != array[i - 1]) {
                ++count;
            }
        }

        return count;
    }
}