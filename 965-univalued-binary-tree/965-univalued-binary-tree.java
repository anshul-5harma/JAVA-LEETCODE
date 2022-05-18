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
    Set<Integer> set = new HashSet();
    public boolean isUnivalTree(TreeNode root) {
        compute(root);
        return set.size() == 1;
    }
    public void compute(TreeNode node) {
        if(node == null) {
            return;
        }
        set.add(node.val);
        compute(node.left);
        compute(node.right);
    }
}