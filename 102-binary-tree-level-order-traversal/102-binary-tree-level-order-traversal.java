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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null) return answer;
        
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()){
            int size = que.size();
             List<Integer> currLevel = new ArrayList<>();
            for (int i =0; i<size; i++){
                TreeNode current = que.remove();
                currLevel.add(current.val);
                if (current.left != null){
                    que.add(current.left);
                } if (current.right != null){
                    que.add(current.right);
                }
            }
            answer.add(currLevel);
        }
        return answer;
        
    }
}