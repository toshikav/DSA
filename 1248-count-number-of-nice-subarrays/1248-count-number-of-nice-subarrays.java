class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);

        for (int num : nums){
            if (num % 2 == 1){
                sum++;
            }

            if (mp.containsKey(sum - k)){
                count += mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
      return count;  
    }       
}