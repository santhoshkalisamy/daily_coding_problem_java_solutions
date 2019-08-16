package net.santhoshk.dailycodingproblem.test;

import net.santoshk.dailycodingproblem.Problem04;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem04Tests {

    Problem04 problem04;

    @Before
    public void setup() {
        problem04 = new Problem04();
    }

    @Test
    public void shouldReturn6() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expected = 6;
        assertEquals(expected, problem04.solution(numbers));
    }

    @Test
    public void shouldReturn2() {
        int[] numbers = {3, 4, -1, 1};
        int expected = 2;
        assertEquals(expected, problem04.solution(numbers));
    }

    @Test
    public void shouldReturn5() {
        int[] numbers = {3, 4, -1, -10, -5, 6, 25, 1, 2, 8};
        int expected = 5;
        assertEquals(expected, problem04.solution(numbers));
    }

    @After
    public void destroy() {
        problem04 = null;
    }

}
