class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;

        for (int i=l; i<=r; i++){
            int sum = 0;
            for (int j=0; j<nums.size(); j++){
                sum += nums.get(j);

                if (j >= i){
                    sum -= nums.get(j-i);
                }
                if (j >= i-1 && sum > 0 && sum < ans){
                    ans = sum;
                }       
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}