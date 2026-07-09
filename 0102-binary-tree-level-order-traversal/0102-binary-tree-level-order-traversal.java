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
        List<List<Integer>> ans = new ArrayList<>();
        level(root, ans, 0);
        return ans;
    }

    private void level(TreeNode node, List<List<Integer>> ans, int idx){
        if (node == null){
            return;
        }
        List<Integer> temp;

        if (ans.size() <= idx){
            temp = new ArrayList<>();
            ans.add(temp);

        }else{
            temp = ans.get(idx);
        }

        temp.add(node.val);
        level(node.left, ans, idx + 1);
        level(node.right, ans, idx + 1);
    }
}