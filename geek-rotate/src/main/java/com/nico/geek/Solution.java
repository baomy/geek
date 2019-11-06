package com.nico.geek;
/**
 * @author     ：nicobao
 * @date       ：Created in 2019/11/6 18:04
 * @description：循环移动数组
 * @modified By：nicobao
 * @version: 0.0.1$
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length <=1 )
            return;
        int count = 0 ,size = nums.length;
        int tmp = 0 ;
        while(count < k)//-1,-100,3,99
        {
            tmp = nums[0];
            for(int i = 1 ; i <= size ; i ++)
            {
                nums[i%size] = nums[i%size] + tmp;
                tmp = nums[i%size] - tmp;
                nums[i%size] = nums[i%size] - tmp;
            }
            count ++;
        }
    }
}
