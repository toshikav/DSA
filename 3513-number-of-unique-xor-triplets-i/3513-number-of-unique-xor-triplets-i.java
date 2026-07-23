class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int count = 0;

        if (nums.length <= 2){
            return nums.length;
        }

        for (int num : nums){
            count |= num;
        }
        return count + 1;
    }
}