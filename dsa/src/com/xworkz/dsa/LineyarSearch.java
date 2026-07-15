package com.xworkz.dsa;

import java.util.Scanner;

public class LineyarSearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,80};
        // int target=7;
        Scanner sc =new Scanner(System.in);
        System.out.println("number");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                // break;
            }
        }

        System.out.println("not valoid");

        sc.close();
    }
}
