class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int score = 0;
        int max = 0;
        int maxFinal = -1;  

        for (int i=0; i<nums.length; i++){
            maxFinal = Math.max(maxFinal, nums[i]);

            if (i == score){
                max = maxFinal;
            }

            if (nums[i] < max - k){
                score = i + 1;
            }
        }   

        if (score < nums.length){
            return score;
        }
        return -1;
    }
}