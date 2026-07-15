package com.xworkz.dsa;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();

        Scanner sc=new Scanner(System.in);
        System.out.println("numvber size:");

        int r=sc.nextInt();
        int[] nums=new int[r];
        System.out.println("number arry enter");
        for(int i=0;i<r;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("target");
         int s=sc.nextInt();
         binarySearch.binary(nums,s);


    }
    public int binary(int[] nums,int target){
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid= (left+right)/2;
            if(nums[mid]==target){
                return  mid;
            }
            if(nums[mid]<target){
                left=mid+1;

            }else {
                right = mid - 1;
            }

        }
        return  -1;
    }
}
