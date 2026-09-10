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
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        calculateValue(root);
        return ans;      
    }
    private int[] calculateValue(TreeNode curr){
        if (curr == null){
            return new int[]{0,0};
        }
        int left[] = calculateValue(curr.left);
        int right[] = calculateValue(curr.right);

        int sum = left[0] + right[0] + curr.val;
        int totalNode = left[1] + right[1] + 1;

        if (sum / totalNode == curr.val ){
            ans++;
        }
        return new int[]{sum, totalNode};
    }
}