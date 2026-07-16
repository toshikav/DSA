class Solution {
    public long gcdSum(int[] nums) {
        long sum = 0;
        int max = 0;

        for (int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            nums[i] = GCD(nums[i], max);


        }
        Arrays.sort(nums);
        
        for (int i=0, j=nums.length-1; i<j; i++, j--){
            sum += GCD(nums[i], nums[j]);
        } 
        return sum;
    }

    public int GCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}