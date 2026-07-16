class Solution {
    public long gcdSum(int[] nums) {
        long sum = 0;
        int prefixGCD[] = new int[nums.length];
        int max = 0;

        for (int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            prefixGCD[i] = GCD(nums[i], max);


        }
        Arrays.sort(prefixGCD);
        int start = 0;
        int end = prefixGCD.length-1;


        while (start < end){
            sum += GCD(prefixGCD[start], prefixGCD[end]);
            start++;
            end--;
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