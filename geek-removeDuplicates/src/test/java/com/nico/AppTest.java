package com.nico;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author     ：nicobao
 * @date       ：Created in 2019/11/6 17:48
 * @description：
 * @modified By：nicobao
 * @version:     0.0.1
 */
public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        Solution solution = new Solution();
        int[] nums = new int []{0,0,1,1,1,2,2,3,3,4};
        int size = solution.removeDuplicates(nums);
        assert( size ==5 );
    }
}
