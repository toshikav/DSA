class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i] < nums[min]){
                min = i;
            }
            if (nums[i] > nums[max]){
                max = i;
            }
        }
        int left = Math.min(min, max);
        int right = Math.max(min, max);

        int o1 = right + 1;
        int o2 = nums.length - left;
        int o3 = (left + 1) + (nums.length - right);

        return Math.min(o1, (Math.min(o2, o3)));
    }
}