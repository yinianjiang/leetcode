package com.yinian.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode0001 {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {1, 2, 3, 5, 7, 9};
        System.out.println(Arrays.toString(twoSum(arr,target)));
        System.out.println(Arrays.toString(twoSum2(arr,target)));

    }

    /**
     * 暴力
     * @param arr
     * @param target
     * @return
     */
    public static int[] twoSum(int[] arr,int target){
        for (int i = 0; i < arr.length -1 ; i++) {
            int temp = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] == temp){
                    return new int[]{i,j};
                }
            }
        }
        return  new int[]{-1,-1};
    }

    public static int[] twoSum2(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(target - arr[i])){
               return new int[]{map.get(target - arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return  new int[0];
    }


}
