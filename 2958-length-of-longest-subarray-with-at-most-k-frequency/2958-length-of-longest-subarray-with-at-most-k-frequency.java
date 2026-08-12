class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       Map<Integer,Integer> freq = new HashMap<>();
       int left = 0;
       int ans = 0;

       for (int i=0; i<nums.length; i++){
        freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

        while (freq.get(nums[i]) > k){
            freq.put(nums[left], freq.get(nums[left]) - 1);

            left++;
        }
        ans = Math.max(ans, i-left + 1);
       }   
       return ans;
    }
}