/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        compute(root);
        return diameter;
    }
    public int compute(TreeNode node) {
        if(node == null) return -1;
        int left_diameter = compute(node.left) + 1;
        int right_diameter = compute(node.right) + 1;
        diameter = Math.max(diameter, left_diameter + right_diameter);
        return Math.max(left_diameter, right_diameter);
    }
}