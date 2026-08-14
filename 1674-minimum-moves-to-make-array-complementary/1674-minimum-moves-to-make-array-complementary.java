class Solution {
    public int minMoves(int[] nums, int limit) {
        int diff[] = new int[2 * limit + 2];
        int ans = Integer.MAX_VALUE;
        int moves = 0;

        for (int i=0; i<nums.length/2; i++){
            int a = nums[i];
            int b = nums[nums.length - 1 - i];

            int left = Math.min(a,b);
            int right = Math.max(a,b);

            int sum = a + b;

            diff[2] += 2;
            diff[2 * limit + 1] -= 2;

            diff[left+1]--;
            diff[limit + right + 1]++;

            diff[sum]--;
            diff[sum + 1]++;

        }

       for (int target = 2; target <= 2 * limit; target++){
        moves += diff[target];

        ans = Math.min(ans, moves);
       }

       return ans;      
    }
}