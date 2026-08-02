package com.xworkz.dsa.quctions;

public class LeetCodeQ5 {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] ref=new int[nums.length * 2];;
            for (int i=0;i<nums.length;i++){
                ref[i]=nums[i];
                ref[i + nums.length] = nums[i];
            }
            return ref;
        }
    }
}
