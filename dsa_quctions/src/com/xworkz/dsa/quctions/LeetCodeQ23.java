package com.xworkz.dsa.quctions;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeQ23 {

        public List<List<Integer>> findMatrix(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            for (int num : nums) {

                // Find a row where num is not already present
                boolean added = false;

                for (List<Integer> row : result) {
                    if (!row.contains(num)) {
                        row.add(num);
                        added = true;
                        break;
                    }
                }

                // If no existing row can accept num, create a new row
                if (!added) {
                    List<Integer> newRow = new ArrayList<>();
                    newRow.add(num);
                    result.add(newRow);
                }
            }

            return result;
        }
    }
