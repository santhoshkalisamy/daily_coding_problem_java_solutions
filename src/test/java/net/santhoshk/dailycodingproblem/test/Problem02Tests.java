package net.santhoshk.dailycodingproblem.test;

import net.santoshk.dailycodingproblem.Problem02;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem02Tests {

    Problem02 problem02;

    @Before
    public void setup() {
        problem02 = new Problem02();
    }

    @Test
    public void shouldReturnCorrectResult() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] expected = {120, 60, 40, 30, 24};
        assertArrayEquals(problem02.solution(numbers), expected);
    }

    @After
    public void destroy() {
        problem02 = null;
    }

}
