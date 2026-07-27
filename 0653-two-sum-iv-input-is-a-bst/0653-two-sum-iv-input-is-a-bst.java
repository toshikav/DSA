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
    
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> temp = new HashSet<>();
        return dfs(root, k, temp); 
    }
    public boolean dfs(TreeNode root, int k, HashSet<Integer> temp){
        if (root == null){
            return false;
        }

        if (temp.contains(k - root.val)){
            return true;
        }

        temp.add(root.val);

        return dfs(root.left, k, temp) || dfs(root.right, k, temp);
    }
}