class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        boolean notZero = false;

        for (int num : nums){
            notZero |= num > 0;
            ans ^= num;
        }

        if (!notZero){
            return 0;
        }
        
        return ans == 0 ? nums.length - 1 : nums.length;
    }
}