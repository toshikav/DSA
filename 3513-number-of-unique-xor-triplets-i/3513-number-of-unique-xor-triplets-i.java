class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int ans = 1;

        if (nums.length <= 2){
            return nums.length;
        }

        while (ans <= nums.length){
            ans <<= 1;
        }
        return ans;
    }
}