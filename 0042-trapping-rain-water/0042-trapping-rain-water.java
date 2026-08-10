class Solution {
    public int trap(int[] height) {
        int left = 0;
        int leftMax = height[left];
        int right = height.length-1;
        int rightMax = height[right];
        int count = 0;

        while (left < right){
            if (leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                count += leftMax - height[left];

            }else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                count += rightMax - height[right];
            }
        }
        return count;
    }
}