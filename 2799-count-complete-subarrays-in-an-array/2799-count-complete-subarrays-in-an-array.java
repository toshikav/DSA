class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for (int num : nums){
            set.add(num);
        }
        int k = set.size();

        for (int i=0; i<nums.length; i++){
            Set<Integer> st = new HashSet<>();

            for (int j=i; j<nums.length; j++){
                st.add(nums[j]);

                if (st.size() == k){
                    ans += (nums.length - j);
                    break;
                }
            }
        }
        return ans;

    }
}