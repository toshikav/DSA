class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(min, max);
    }
    private int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}