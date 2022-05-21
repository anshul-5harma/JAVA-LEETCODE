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
    int min = Integer.MAX_VALUE;
    int previous = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) {
            return 0;
        }
        getMinimumDifference(root.left);
        min = Math.min(min, Math.abs(previous - root.val));
        previous = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}