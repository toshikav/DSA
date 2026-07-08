class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int far = 0;
        int near = 0;

        while (far < nums.length - 1){
            int last = 0;
            for (int i=near; i <= far; i++){
                last = Math.max(last, nums[i] + i);
            }
            near = far + 1;
            far = last;
            count++;
        }
        return count;
    }
}