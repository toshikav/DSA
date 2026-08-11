class Solution {
    public int missingInteger(int[] nums) {
        boolean seen[] = new boolean[1276];
        
        for (int num : nums){
           seen[num] = true;
        }
        int sum = nums[0];

        for (int i=1; i<nums.length; i++){
            if (nums[i] == nums[i-1] + 1){
                sum += nums[i];

            }else{
                break;
            }        
        }
        while (seen[sum]){
            sum++;
        }
        return sum;
    }
}