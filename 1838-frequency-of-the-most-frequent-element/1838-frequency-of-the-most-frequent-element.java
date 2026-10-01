class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int left = 0;
        int max = 0;
        

        for (int right = 0; right < nums.length; right++){
            sum += nums[right];
            long cost = (long) nums[right] * (right - left + 1) - sum;

            while (cost > k){
                sum -= nums[left];
                left++;

                cost = (long) nums[right] * (right - left + 1) - sum;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}