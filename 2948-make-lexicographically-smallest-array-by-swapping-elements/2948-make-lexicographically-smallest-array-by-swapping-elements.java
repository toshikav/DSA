class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int arr[][] = new int[nums.length][2];

        for (int i=0; i<nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr,(a,b) -> a[0] - b[0]);
        int ans[] = new int[nums.length];

        int start = 0;

        while (start < nums.length){
            int end = start;

            while (end + 1 < nums.length && arr[end + 1][0] - arr[end][0] <= limit){
                end++;
            }

            ArrayList<Integer> idx = new ArrayList<>();

            for (int i=start; i<=end; i++){
                idx.add(arr[i][1]);
            }

            Collections.sort(idx);

            for (int i=0; i<idx.size(); i++){
                ans[idx.get(i)] = arr[start + i][0];

            }
            start = end + 1;
        }

        return ans;
    }
}