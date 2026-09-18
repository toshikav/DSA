class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int ans = arr.length + 1;
        int sum = 0;
        int left = 0;

        int dp[] = new int[arr.length + 1];
        Arrays.fill(dp, arr.length);

        for (int right = 0; right<arr.length; right++){
            sum += arr[right];

            while (sum > target){
                sum -= arr[left++];
            }
            dp[right + 1] = dp[right];

            if (sum == target){
                ans = Math.min(ans, right - left + 1 + dp[left]);
                dp[right + 1] = Math.min(dp[right], right - left + 1);
            }
        }
        if (ans == arr.length + 1){
            return -1;
        }
        return ans;

    }
}