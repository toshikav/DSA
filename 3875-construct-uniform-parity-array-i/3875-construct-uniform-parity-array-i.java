class Solution {
    public boolean uniformArray(int[] nums1) {
        int nums2[] = new int[nums1.length];
        for (int i=0; i<nums1.length; i++){
            for (int j=i; j<nums1.length; j++){
                if (j != i){
                    nums2[i] = nums1[i] - nums1[j];
                }
            }
            nums2[i] = nums1[i];   
        }
        for (int num : nums2){
            if (num % 2 == 0){
                return true;
            }
            if (num % 2 != 0){
                return true;
            }
        }
        return false;
    }
}