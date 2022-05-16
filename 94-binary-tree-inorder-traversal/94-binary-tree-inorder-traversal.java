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
    List<Integer> ret = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root,ret);
        return ret;
    }
    public void helper(TreeNode root, List<Integer> ret){
        if (root == null) return;
        helper(root.left, ret);
        ret.add(root.val);
        helper(root.right, ret);
    }
}