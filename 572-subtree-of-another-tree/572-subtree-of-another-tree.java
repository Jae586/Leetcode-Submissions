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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if (root == null) return false;
        if (subRoot == null) return true;
           if ( isEqual(root, subRoot))
               return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    public boolean isEqual(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null) return true;
        if (root ==null || subRoot == null) return false;
        
        return subRoot.val == root.val&&(isEqual(root.left, subRoot.left))&&(isEqual(root.right,subRoot.right));
    }
    }
