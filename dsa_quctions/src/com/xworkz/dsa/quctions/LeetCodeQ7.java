package com.xworkz.dsa.quctions;

public class LeetCodeQ7 {
    public int maximumWealth(int[][] accounts) {
        int greatest = accounts[0][0];

        for (int i = 0; i < accounts.length; i++) {
            int count=0;
            for (int j = 0; j <accounts[i].length; j++) {

                count+=accounts[i][j];
            }
            if (count > greatest) {
                greatest = count;

            }
        }
        return greatest;

    }
}

