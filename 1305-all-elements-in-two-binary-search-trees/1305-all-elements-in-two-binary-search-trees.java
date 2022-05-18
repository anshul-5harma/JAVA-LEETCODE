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
    List<Integer> to_return = new ArrayList();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        compute(root1);
        compute(root2);
        Collections.sort(to_return);
        return to_return;
    }
    public void compute(TreeNode node) {
        if(node == null) {
            return;
        }
        to_return.add(node.val);
        compute(node.left);
        compute(node.right);
    }
}