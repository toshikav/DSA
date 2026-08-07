class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        
        for (int weight : weights){
            left = Math.max(left, weight);
            right += weight;
        }
        int ans = right;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)){
                ans = mid;
                right = mid - 1;

            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    private boolean canShip(int weights[], int days, int capacity){
        int daysNeed = 1;
        int curr = 0;

        for (int weight : weights){
            if (curr + weight <= capacity){
                curr += weight;
            }else{
                daysNeed++;
                curr = weight;
            }
        }
        return daysNeed <= days;
    }
}