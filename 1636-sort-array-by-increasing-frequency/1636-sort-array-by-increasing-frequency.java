class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        Integer[] freq = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            freq[i] = nums[i];
        }

        Arrays.sort(freq, (a, b) -> {
            if (!mp.get(a).equals(mp.get(b))) {
                return mp.get(a) - mp.get(b);
            }
            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = freq[i];
        }

        return nums;
    }
}
