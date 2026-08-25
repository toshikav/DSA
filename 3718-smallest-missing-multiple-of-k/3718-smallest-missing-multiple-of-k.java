class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int multiple = k;
        int curr = 0;

        while (curr < nums.length){
            if (nums[curr] < multiple){
                curr++;
            }

            else if (nums[curr] == multiple){
                multiple += k;
                curr++;
            }else{
                return multiple;
            }
        }
        return multiple;
    }
}