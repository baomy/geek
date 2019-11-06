package com.nico.geek;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Solution solution = new Solution();
        int[] nums = new int[]{-1,-100,3,99};
        solution.rotate(nums ,2);
        for(int i= 0 ;i < nums.length ; i++)
        {
            System.out.print(nums[i] + "  ");
        }
    }
}
