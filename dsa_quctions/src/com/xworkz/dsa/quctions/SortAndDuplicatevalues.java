package com.xworkz.dsa.quctions;

import java.util.Arrays;

public  class SortAndDuplicatevalues {


    public static void main(String[] args) {
    SortAndDuplicatevalues sortAndDuplicatevalues=new SortAndDuplicatevalues();
    System.out.println(sortAndDuplicatevalues.smallestSubsequence("bcabc"));

        }

    public String smallestSubsequence (String s){

            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (result.indexOf(ch) == -1.) {
                    result += ch;


                }
            }

            char[] arr = result.toCharArray();
            Arrays.sort(arr);

            return new String(arr);


        }
    }



