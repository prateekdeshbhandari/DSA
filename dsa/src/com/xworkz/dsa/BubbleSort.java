package com.xworkz.dsa;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={7,5,9,4,8,2};
        int temp=0;
        System.out.println("before sorting: ");
        for (int ssss:arr) {
            System.out.println(ssss);
        }
        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        System.out.println("after sorting: ");
        for (int sss:arr) {
            System.out.println(sss);
        }

    }
}
