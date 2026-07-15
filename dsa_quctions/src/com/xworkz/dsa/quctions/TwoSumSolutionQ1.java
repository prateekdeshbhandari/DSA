package com.xworkz.dsa.quctions;

import lombok.ToString;

import java.util.Arrays;
import java.util.Scanner;

@ToString

public class TwoSumSolutionQ1 {

    public static void main(String[] args) {

        TwoSumSolutionQ1 twoSumSolution=new TwoSumSolutionQ1();

        try {
            Scanner sc=new Scanner(System.in);
            //int[] nums={3,5,8,0};
            System.out.println("number is size:");
            int n= sc.nextInt();
            int[] nums=new int[n];
            System.out.println("n element");
for (int i=0;i<n;i++){
    nums[i]=sc.nextInt();
}
            System.out.println("target is:");
            int target= sc.nextInt();
            int[] result = twoSumSolution.twoSum(nums, target);
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
