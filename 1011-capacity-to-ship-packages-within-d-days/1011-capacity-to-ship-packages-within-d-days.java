class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        
        for (int weight : weights){
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right){
            int mid = left + (right - left) / 2;
            int daysNeed = 1;
            int curr = 0;
            
            for (int weight : weights){
                if (curr + weight > mid){
                    daysNeed++;
                    curr = weight;
                }else{
                    curr += weight;
                }      
            }
            if (daysNeed > days){
                left = mid + 1;

            }else{
                right = mid;
            }
        }
        return left;
    }
}