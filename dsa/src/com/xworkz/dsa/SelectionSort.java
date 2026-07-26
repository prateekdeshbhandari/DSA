package com.xworkz.dsa;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,8,2,3,9};
        int temp=0;
        int minIndex=0;
        System.out.println("before sorting: "+" ");
        for (int ssss:arr) {
            System.out.println(ssss);
        }
        for(int i=0;i<arr.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            System.out.println("after sorting: ");



        }
        for (int ssss:arr) {

            System.out.println(" " + ssss);
        }

    }
}
