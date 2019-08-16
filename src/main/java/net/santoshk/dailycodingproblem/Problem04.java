package net.santoshk.dailycodingproblem;

import java.util.Arrays;

public class Problem04 {

    public int solution(int[] nums) {
        Arrays.sort(nums);
        int expectedMinimum = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] == expectedMinimum) {
                expectedMinimum++;
            } else {
                return expectedMinimum;
            }
        }
        return expectedMinimum;
    }
}
