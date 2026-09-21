class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];

        Arrays.fill(ans, -1);
        Stack<Integer> stk = new Stack<>();

        for (int i=0; i<nums.length * 2; i++){
            int idx = i % nums.length;

            while (!stk.isEmpty() && nums[stk.peek()] < nums[idx]){
                ans[stk.pop()] = nums[idx];
            }

            if (i < nums.length){
                stk.push(idx);
            }
        }
        return ans;
    }
}