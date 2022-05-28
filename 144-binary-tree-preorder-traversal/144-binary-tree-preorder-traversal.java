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
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root, ret);
        return ret;
    }
    
    public void helper(TreeNode root, List ret){
        if (root == null) return;
        ret.add(root.val);
        helper(root.left,ret);
        helper(root.right,ret);
    }
   
}