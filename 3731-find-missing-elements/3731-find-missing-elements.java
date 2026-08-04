class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int end = nums[nums.length - 1];
        int idx = 0;
        int curr = nums[0];

        while (curr < end){
            if (nums[idx] == curr){
                curr++;
                idx++;
                continue;
            }else{
                while (curr < nums[idx]){
                    ans.add(curr++);
                }
                idx++;
                curr++;
            }
        }
        return ans;
    }
}