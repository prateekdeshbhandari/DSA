package com.xworkz.dsa.quctions;

import javax.swing.tree.TreeNode;

public class LeetCodeQ21 {


        int count = 0;

        public int averageOfSubtree(TreeNode root) {
            dfs(root);
            return count;
        }

        private int[] dfs(TreeNode root) {

            if (root == null) {
                return new int[]{0, 0};
            }

            // Left subtree
            int[] left = dfs(root.left);

            // Right subtree
            int[] right = dfs(root.right);

            // Current subtree sum
            int sum = root.val + left[0] + right[0];

            // Current subtree node count
            int nodes = 1 + left[1] + right[1];

            // Average
            int average = sum / nodes;

            // Check condition
            if (root.val == average) {
                count++;
            }

            // Return sum and count of nodes
            return new int[]{sum, nodes};
        }
    }
