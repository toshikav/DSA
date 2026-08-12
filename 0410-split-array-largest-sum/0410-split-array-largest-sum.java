class Solution {

    public int splitArray(int[] nums, int k) {
    
        int left = Integer.MIN_VALUE;
        int right = 0;

        for (int num : nums){
            left = Math.max(left,num);
            right += num;
        }
        int ans = 0;

        while (left <= right){
            int mid = left + (right - left) / 2;
            int subarrays = 1;
            int sum = 0;

            for (int num : nums){
                if (sum + num > mid){
                    subarrays++;
                    sum = num;

                }else{
                    sum += num;
                }
            }

            if (subarrays <= k){
                ans = mid;
                right = mid - 1;

            }else{
                left = mid + 1;
            }
        }

        return ans;
    }
}