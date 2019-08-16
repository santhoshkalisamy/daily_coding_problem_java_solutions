package net.santhoshk.dailycodingproblem.test;

import net.santoshk.dailycodingproblem.Problem01;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class Problem01Tests {

    Problem01 problem01;

    @Before
    public void setup(){
        problem01 = new Problem01();
    }

    @Test
    public  void shouldReturnTrue(){
        int []numbers = {1,2,3,4,5};
        Assert.assertTrue(problem01.solution(numbers, 6));
    }

    @Test
    public  void shouldReturnFalse(){
        int []numbers = {1,2,3,4,5};
        Assert.assertFalse(problem01.solution(numbers, 10));
    }

    @After
    public void destroy(){
        problem01 = null;
    }

}
