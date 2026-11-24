class Solution {
    public int maxLength(int[] nums) {
        int ans = 2;
        int left = 0;
        int prod = 1;

        for (int right =0; right<nums.length; right++){
            int r = nums[right];
            while (gcd(prod, r) > 1){
                prod /= nums[left++];
            }
            prod *= r;
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