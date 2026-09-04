class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combined[] = new int[nums1.length + nums2.length];
        for (int i=0; i<nums1.length; i++){
            combined[i] = nums1[i];
        }
        for (int i=0;i<nums2.length; i++){
            combined[nums1.length + i] = nums2[i];
        }

        Arrays.sort(combined);
        int mid = combined.length / 2;

        if (combined.length % 2 != 0){
            return combined[mid];
        }
        
        return (combined[mid - 1] + combined[mid]) / 2.0;
    }
}