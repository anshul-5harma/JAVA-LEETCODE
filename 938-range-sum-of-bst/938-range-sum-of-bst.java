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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        return compute(root, low, high);
    }
    public int compute(TreeNode node, int low, int high) {
        if(node == null) {
            return 0;
        }
        if(node.val >= low && node.val <= high) {
            sum += node.val;
        }
        compute(node.left, low, high);
        compute(node.right, low, high);
        return sum;
    }
}