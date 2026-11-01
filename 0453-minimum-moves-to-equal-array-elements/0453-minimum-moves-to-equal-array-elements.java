class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        long ans = 0;

        for (int num : nums){
            if (num < min){
                min = num;
            }
        }

        for (int num : nums){
            ans += num - min;
        }
        return (int) ans;
    }
}