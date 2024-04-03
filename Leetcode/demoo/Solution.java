package Leetcode.demoo;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int num1 = 0;
        int num2 = 0;

        TreeNode temp1 = root;
        TreeNode temp2 = root;

        while (temp1.left != null) {
            temp1 = temp1.left;
            if (temp1.left == null) {
                num1 = temp1.val;
            }
        }

        while (temp2.right != null) {
            temp2 = temp2.right;
            if (temp2.left == null) {
                num2 = temp2.val;
            }
        }

        return num1 + num2;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}