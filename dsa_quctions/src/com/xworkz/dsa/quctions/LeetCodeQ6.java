package com.xworkz.dsa.quctions;

public class LeetCodeQ6 {

        public int maxFreqSum(String s) {
            int[] freq = new int[26];

            // Count frequency of each character
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            int maxVowel = 0;
            int maxConsonant = 0;

            // Find maximum frequencies
            for (int i = 0; i < 26; i++) {
                char ch = (char) (i + 'a');

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }

            return maxVowel + maxConsonant;
        }
    }

