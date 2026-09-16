class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count[] = new int[nums.length + 1];
        int prevSum = 0;
        int ans = 0;
        count[0] = 1;

        for (int num : nums){
            prevSum += num;

            if (prevSum >= goal){
                ans +=  count[prevSum - goal];
            }
            count[prevSum]++;
        }
        return ans;
    }
}