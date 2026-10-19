class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        Arrays.stream(nums).forEach(n -> mp.put(n, mp.getOrDefault(n, 0) + 1));

        return Arrays.stream(nums).boxed().sorted((a,b) -> mp.get(a) != mp.get(b) ? mp.get(a) - mp.get(b) : b - a).mapToInt(n -> n).toArray();

    }
}
