package com.artisan.algorithm.daily2020.training12.T1221;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小工匠
 * @version 1.0
 * @description: 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @date 2020/12/21 9:16
 * @mark: show me the code , change the world
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length ;
        for (int i = 0; i < len; i++) {
            for (int j = i+1 ; j < len ; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }




    public static int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(len - 1);
        for (int i = 0; i < len; i++) {
            int another = target - nums[i] ;
            if (map.containsKey(another)){
                return new int[]{map.get(another),i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        //int[] targetArr = twoSum(nums, target);

        int[] targetArr = twoSum2(nums, target);

        System.out.println(targetArr[0]);
        System.out.println(targetArr[1]);

    }
}
    