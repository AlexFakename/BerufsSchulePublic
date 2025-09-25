package org.priester.industries;

public class Aufgabe1 {


    /**
     * Empty array will return all zeroes
        @return array with smallest at index 0, largest at index 1 and difference(absolute) in index 2
     */
    public int[] getSmallestLargestDiff(int[] input) {
        if (input == null) {
            return new int[] {0,0,0};
        }
        if (input.length == 0) {
            return new int[] {0,0,0};
        }
        int[] result = new int[3];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;

        for (int val : input) {
            result[0] = Math.min(result[0], val);
            result[1] = Math.max(result[1], val);
        }


        result[2] = Math.abs(result[0] - result[1]);
        System.out.println("Diff: " + result[2]);

        return result;
    }
}
