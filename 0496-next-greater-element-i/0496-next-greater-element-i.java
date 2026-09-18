class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Deque<Integer> q = new ArrayDeque<>();
        int ans[] = new int[nums1.length];

        
            for (int num : nums2){
               while (!q.isEmpty() && q.peek() < num){
                nextGreater.put(q.pop(), num);
               }
               q.push(num);         
            }

            for (int i=0; i<nums1.length; i++){
                ans[i] = nextGreater.getOrDefault(nums1[i], -1);
            }
        
        return ans;
    }
}