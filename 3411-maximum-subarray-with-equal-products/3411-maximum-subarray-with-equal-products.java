class Solution {
    public int maxLength(int[] nums) {
        int ans = 2;
        int left = 0;
        int prod = 1;

        for (int right =0; right<nums.length; right++){

            while (gcd(prod, nums[right]) > 1){
                prod /= nums[left++];
            }
            prod *= nums[right];
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
        
    }
    private int gcd(int a, int b){
        if (b == 0){
            return a;

        }
        return gcd(b, a % b);
    }
}