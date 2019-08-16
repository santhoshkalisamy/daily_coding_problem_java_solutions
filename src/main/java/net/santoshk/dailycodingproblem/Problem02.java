package net.santoshk.dailycodingproblem;

import java.util.HashSet;

public class Problem02 {

    public int[] solution(int[] nums) {
        int result[] = new int[nums.length];
        int totalProduct = 1;
        for (int num : nums) {
            totalProduct *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = totalProduct / nums[i];
        }
        return result;
    }
}
