class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int left = 0;
        long max = 0;
        int right = 0;
        

       while (right < nums.length){
        sum += nums[right];

        while (nums[right] * (right - left + 1L) > sum + k){
            sum -= nums[left];
            left++;
        }
        max = Math.max(max, right - left + 1L);
        right++;
        
       }
       return (int) max;
    }
}