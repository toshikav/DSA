class Solution {
    public long maxAlternatingSum(int[] nums) {
        long square[] = new long[nums.length];

        for (int i=0; i<nums.length; i++){
            square[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(square);
        long ans = 0;
        int positive = (nums.length + 1) / 2;

        for (int i=0; i<nums.length; i++){
            if (i < positive){
                ans += square[nums.length - 1 - i];
            }
            else {
                ans -= square[nums.length - 1 - i];
            }
        }

        return ans;
    }
}