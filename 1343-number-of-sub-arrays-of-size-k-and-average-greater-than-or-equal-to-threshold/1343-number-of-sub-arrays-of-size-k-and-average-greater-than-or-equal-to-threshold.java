class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int num = k * threshold;
        
        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        if (sum >= num){
            count++;
        }

        for (int i=k; i<arr.length; i++){
            sum -= arr[i - k];
            sum += arr[i];

            if (sum >= num){
                count++;
            }
        }
        return count;
    }
}