class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, ans, sub);
        return ans;

    }

    private void backtrack(int[] nums, int idx, List<List<Integer>> ans, List<Integer> sub ){
        if (idx == nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[idx]);
        backtrack(nums, idx + 1, ans, sub); // take
        sub.remove(sub.size() - 1); // backtrack

        while (idx + 1 < nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }

        backtrack(nums, idx + 1, ans, sub); // not take
    }
}