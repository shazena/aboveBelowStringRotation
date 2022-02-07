package com.shazena.abovebelowstringrotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shazena Feb 6, 2022
 */
public class AtHomeCodingExercise {

    public static void main(String[] args) {

        String testingString = "HelloPunk";

        for (int i = 1; i < 30; i++) {
            System.out.println(stringRotation(testingString, i));
        }
    }

    /**
     * aboveBelow - accepts two arguments. Returns a Map indicating how many
     * numbers were above the comparison value and how many numbers were below
     * the comparison value.
     *
     * @param list (An unsorted collection of integers, ArrayList)
     * @param comparisonVal (an integer, int)
     * @return HashMap<String, Integer> of the format {"above": int, "below":
     * int}
     */
    public static HashMap<String, Integer> aboveBelow(ArrayList<Integer> list, int comparisonVal) throws Exception {

        if (list == null) {
            throw new Exception("Validation Error");
        }
        HashMap<String, Integer> result = new HashMap<>();

        int above = 0;
        int below = 0;

        for (Integer i : list) {
            if (i > comparisonVal) {
                above++;
            } else if (i < comparisonVal) {
                below++;
            }
        }

        result.put("below", below);
        result.put("above", above);

        return result;

    }

    /**
     * stringRotation - accepts two parameters. I determined this one by making
     * a table where the first column is the rotation amount and the second is
     * the rotated string. I made entries for up to 2.5 times the length of my
     * test string and realized that there was a pattern at every multiple of
     * the string length, which indicates modular division. I combined this
     * information with the substring method and came up with the following
     * solution.
     *
     * @param originalString (the original string, String)
     * @param rotationAmt (the rotation amount, positive int)
     * @return String - the rotated string
     */
    public static String stringRotation(String originalString, int rotationAmt) {

        int length = originalString.length();

        int offsetAmt = rotationAmt % length;

        String result = originalString.substring(offsetAmt, length) + originalString.substring(0, offsetAmt);

        return result;
    }

}
