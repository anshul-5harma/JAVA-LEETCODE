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
    int max = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        helper(root, 0);
        return sum;
    }
    public void helper(TreeNode node, int depth) {
        if(node == null) return;
        if(depth > max) {
            sum = 0;
            max = depth;
        }
        if(depth == max) {
            sum += node.val;
        }
        helper(node.left, depth + 1);
        helper(node.right, depth + 1);
    }
}