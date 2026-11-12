class Solution {
    public int longestMonotonicSubarray(int[] nums) {
      int forInc = 1;
      int forDec = 1;
      int maxInc =1; 
      int maxDec = 1;
      int max = 1;

      for (int i=1; i<nums.length; i++){
        if (nums[i] > nums[i-1]){
            forInc ++;
        } else{
            forInc = 1;
        }

      if (nums[i]< nums[i-1]){
        forDec ++;
      }else{
        forDec = 1;
               
      }
       maxDec = Math.max(maxDec, forDec);
       maxInc = Math.max(maxInc, forInc);
       max = Math.max(maxDec, maxInc);
       }
       return max;
    }
}