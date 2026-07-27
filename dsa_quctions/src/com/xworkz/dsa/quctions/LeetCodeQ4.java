package com.xworkz.dsa.quctions;

import java.util.HashSet;
import java.util.Set;



public class LeetCodeQ4 {
    int maxDistinct(String s) {
        Set<Character> ss=new HashSet();
        for(int i=0;i<s.length();i++){
            ss.add(s.charAt(i));
        }
        return ss.size();
    };
    public static void main(String[] args) {
        LeetCodeQ4 dd=new LeetCodeQ4();
        System.out.println(dd.maxDistinct("abcabcbb"));

        }

    }

