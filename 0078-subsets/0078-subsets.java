class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        backtrack(nums, 0, ans, sub);
        return ans;
    }
    private void backtrack(int nums[], int idx, List<List<Integer>> ans, List<Integer> sub){
        if (idx == nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[idx]);
        backtrack(nums, idx + 1, ans, sub);

        sub.remove(sub.size() - 1);
        backtrack(nums, idx + 1, ans, sub);

    }
}