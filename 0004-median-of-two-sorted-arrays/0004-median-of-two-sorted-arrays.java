class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int med1 = 0;
        int med2 = 0;

        for (int m=0; m <= (nums1.length + nums2.length) / 2; m++){
            med2 = med1;

            if (i != nums1.length && j != nums2.length){
                if (nums1[i] > nums2[j]){
                    med1 = nums2[j];
                    j++;

                }else{
                    med1 = nums1[i];
                    i++;
                }

            }else if(i < nums1.length){
                med1 = nums1[i];
                i++;
            }else{
                med1 = nums2[j];
                j++;
            }
        }
        if ((nums1.length + nums2.length) % 2 == 1){
            return med1;

        }else{
            double ans = (double) med1 + (double) med2;
            return ans / 2.0;
        }
    }
}