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
    public int sumEvenGrandparent(TreeNode root) {
        int[] sum = new int[1];
        sum[0] = 0;
        compute(root, null, null, sum);
        return sum[0];
    }
    
    public void compute(TreeNode root, TreeNode parent, TreeNode grandParent, int[] sum) {
        if(root == null) return;
        compute(root.left, root, parent, sum);
        compute(root.right, root, parent, sum);
        if(grandParent != null && grandParent.val % 2 == 0) sum[0] += root.val;
    }
}