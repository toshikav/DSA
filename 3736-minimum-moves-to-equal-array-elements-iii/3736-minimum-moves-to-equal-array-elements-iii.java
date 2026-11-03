class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++){
            ans += nums[nums.length - 1] - nums[i];
        }
        return ans;
    }
}