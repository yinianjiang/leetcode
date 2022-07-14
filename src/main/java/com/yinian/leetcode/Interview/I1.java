package com.yinian.leetcode.Interview;

import java.util.Arrays;

/**
 * 拿糖问题 给一个数组{1,3,5,7,8,10}，每个位置上数字代表每个位上有几个糖，不能拿相邻的糖，最终怎么拿最多的糖
 */
public class I1 {
    public static void main(String[] args) {
        System.out.println(Math.max(8,8));
        int[] arr = {3,1,5,7,8,10};
        System.out.println(rob(arr));

    }
    public static int rob(int[] nums){
        if(nums ==null ||nums.length ==0) return 0;
        if(nums.length ==1) return  nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);
        for (int i = 2 ;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[nums.length-1];
    }

}
