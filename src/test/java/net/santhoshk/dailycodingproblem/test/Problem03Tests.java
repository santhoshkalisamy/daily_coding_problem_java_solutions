package net.santhoshk.dailycodingproblem.test;

import net.santoshk.dailycodingproblem.Problem03;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem03Tests {

    Problem03 problem03;

    @Before
    public void setup() {
        problem03 = new Problem03();
    }

    @Test
    public void shouldReturn6() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expected = 6;
        assertEquals(expected, problem03.solution(numbers));
    }

    @Test
    public void shouldReturn2() {
        int[] numbers = {3, 4, -1, 1};
        int expected = 2;
        assertEquals(expected, problem03.solution(numbers));
    }

    @Test
    public void shouldReturn5() {
        int[] numbers = {3, 4, -1, -10, -5, 6, 25, 1, 2, 8};
        int expected = 5;
        assertEquals(expected, problem03.solution(numbers));
    }

    @After
    public void destroy() {
        problem03 = null;
    }

}
