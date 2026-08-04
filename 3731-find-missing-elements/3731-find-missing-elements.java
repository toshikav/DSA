class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0; i<nums.length-1; i++){

            while (nums[i] + 1 < nums[i+1]){
                nums[i]++;
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}