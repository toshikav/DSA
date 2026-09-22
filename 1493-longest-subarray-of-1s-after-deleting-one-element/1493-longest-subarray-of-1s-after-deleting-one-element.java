class Solution {
    public int longestSubarray(int[] nums) {
        int zeros = 0;
        int left = 0;
        int count = 0;

        for (int right =0; right <nums.length; right++){
            if (nums[right] == 0){
                zeros++;
            }

            while (zeros > 1){
                if (nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            count = Math.max(count, right - left +1 - zeros);
        }

        if (count == nums.length){
            return count - 1;
        }

        return count;
    }
}