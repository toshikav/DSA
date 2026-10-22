class Solution {
    public int minOperations(int[] nums) {
        int inc = 1;
        int dec = 1;

        for (int i=1; i<nums.length; i++){
            if (nums[i] == (nums[i-1]+1) % nums.length){
                inc++;
            }
            if (nums[i-1] == (nums[i] + 1) % nums.length){
                dec++;
            }
        }

        if (inc == nums.length){
            if (nums[0] == 0){
                return 0;
            }
            else{
                return Math.min(nums.length - nums[0], nums[0] + 2);
            }
        }

        if (dec == nums.length){
            return Math.min(nums.length - nums[nums.length - 1], nums[nums.length-1])+1;
        }

        return -1;
    }
}