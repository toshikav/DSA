class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        boolean notZero = false;

        for (int num : nums){
            ans ^= num;
            if (num != 0){
                notZero = true;
            }
        }

        if (!notZero){
            return 0;
        }
        if (ans != 0){
            return nums.length;
        }
        
        return nums.length - 1;
    }
}