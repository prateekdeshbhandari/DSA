package com.xworkz.dsa.runner;

import lombok.ToString;

import java.lang.reflect.Array;
import java.util.Arrays;

@ToString

public class TwoSumSolution {

    public static void main(String[] args) {

        TwoSumSolution twoSumSolution=new TwoSumSolution();
        try {
            int[] nums={3,5,8,0};
            int[] result = twoSumSolution.twoSum(nums, 5);
            System.out.println(Arrays.toString(result));
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }
}
