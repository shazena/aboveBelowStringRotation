package com.shazena.abovebelowstringrotation;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Shazena Feb 6, 2022
 */
public class AtHomeCodingExercise {

    public static void main(String[] args) {

        ArrayList<Integer> testingList = new ArrayList<>();

        testingList.add(1);
        testingList.add(5);
        testingList.add(2);
        testingList.add(1);
        testingList.add(10);

        System.out.println(aboveBelow(testingList, 6));

    }

    /**
     * aboveBelow - accepts two arguments.
     *
     * @param list (An unsorted collection of integers, ArrayList)
     * @param comparisonVal (an integer)
     * @return HashMap<String, Integer> of the format {"above": int, "below":
     * int}
     */
    public static HashMap<String, Integer> aboveBelow(ArrayList<Integer> list, int comparisonVal) {

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

}
