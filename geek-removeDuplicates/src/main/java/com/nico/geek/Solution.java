package com.nico.geek;

/**
 * @author     ：nico
 * @date       ：Created in 2019/11/6 17:22
 * @description：有序队列删除重复数据
 * @modified By：nico
 * @version: 0.0.1$
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int size =0 ,cur =0;
        if(nums != null && (size =  nums.length) > 0)
        {
            for(int i = 0 ; i< size ; i ++)
            {
                if(nums[cur] != nums[i])
                {
                    cur++;
                    nums[cur] = nums[i];
                }
            }
        }
        return cur+1;
    }
}
