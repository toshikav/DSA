class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;

        for (int i=0; i<n; i++){
            ans = (nums[n-1]-1) * (nums[n - 2]-1);

        }
        return ans;
    }
}