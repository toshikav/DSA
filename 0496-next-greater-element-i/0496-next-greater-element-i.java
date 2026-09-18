class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];

        for (int i=0; i<nums1.length; i++){
            int target = nums1[i];
            int nextGreater = -1;
            boolean found = false;

            for (int num : nums2){
                if (num == target){
                    found = true;
                }else if (found){
                    if (num > target){
                        nextGreater = num;
                        break;
                    }
                }
                
            }
            ans[i] = nextGreater;
        }
        return ans;
    }
}