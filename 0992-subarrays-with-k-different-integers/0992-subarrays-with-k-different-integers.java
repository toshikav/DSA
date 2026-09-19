class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();

        int left1 = 0;
        int left2 = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            mp1.put(nums[right], mp1.getOrDefault(nums[right], 0) + 1);

            while (mp1.size() > k) {
                mp1.put(nums[left1], mp1.get(nums[left1]) - 1);

                if (mp1.get(nums[left1]) == 0) {
                    mp1.remove(nums[left1]);
                }
                left1++;
            }

            mp2.put(nums[right], mp2.getOrDefault(nums[right], 0) + 1);

            while (mp2.size() > k - 1) {
                mp2.put(nums[left2], mp2.get(nums[left2]) - 1);

                if (mp2.get(nums[left2]) == 0) {
                    mp2.remove(nums[left2]);
                }
                left2++;
            }
            count += left2 - left1;
        }
        return count;
    }
}