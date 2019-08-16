package net.santoshk.dailycodingproblem;

import java.util.HashSet;

public class Problem01 {

    public boolean solution(int[] nums, int sum) {
        HashSet<Integer> compliments = new HashSet<>();
        for (int n : nums) {
            if (compliments.contains(n)) {
                System.out.println("True");
                return true;
            }
            int comp = sum - n;
            compliments.add(comp);
        }
        System.out.println("False");
        return false;
    }
}
