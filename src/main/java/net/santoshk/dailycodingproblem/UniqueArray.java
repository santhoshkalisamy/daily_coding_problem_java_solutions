package net.santoshk.dailycodingproblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 *
 * Given N integers (which contains duplicates ) in an array, make the array unique.
 *
 * Constraints,.
 * 1. You can only increment the values and you cannot decrement.
 * 2. Make array unique in minimal number of increments such that the sum of total elements in the array has to be minimum.
 *
 */

public class UniqueArray {
    public static void main(String[] args) {
        Integer[] numbers = {8, 51, 3, 25, 6, 3, 3, 5, 9};
        Arrays.sort(numbers);
        Set<Integer> unique = new HashSet();
        unique.addAll(Arrays.asList(numbers));
        int min = 1;
        int diff = numbers.length - unique.size();
        for (int i = 0; i < diff; i++) {
            while (unique.contains(min)) {
                min++;
            }
            unique.add(min);
        }
        System.out.println(unique);
    }
}
