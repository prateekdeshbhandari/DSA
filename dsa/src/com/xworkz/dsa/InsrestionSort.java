package com.xworkz.dsa;

public class InsrestionSort {
    public static void main(String[] args) {


        int[] arr = {7, 8, 3, 4, 9};
        for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i-1;
        while (j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
        }
    }
}
