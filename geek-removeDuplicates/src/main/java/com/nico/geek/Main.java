package com.nico.geek;
/**
 * @author     ：nico
 * @date       ：Created in 2019/11/6 17:22
 * @description：有序队列删除重复数据
 * @modified By：nico
 * @version: 0.0.1$
 */
public class Main {

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = new int []{0,0,1,1,1,2,2,3,3,4};
        int size = solution.removeDuplicates(nums);
        for(int i = 0 ; i < size ; i ++ )
        {
            System.out.print("nums[" + i  + "]=" + nums[i] + ",");
        }
        System.out.println();
        System.out.println("size = " + size );
    }
}
