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
        if (min > max){
            int temp = min;
            min = max; 
            max = temp;
        }

        int o1 = max + 1;
        int o2 = nums.length - min;
        int o3 = (min + 1) + (nums.length - max);

        return Math.min(o1, (Math.min(o2, o3)));
    }
}