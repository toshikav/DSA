class Solution {
    public int minSwaps(int[] nums) {
        int arr[][] = new int[nums.length][2];

        for (int i=0; i<nums.length; i++){
            int sum = 0;
            int num = nums[i];

            while (num > 0){
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] =  nums[i];
            arr[i][1] = sum;
        } 

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            mp.put(nums[i], i);
        }

        boolean visited[] = new boolean[nums.length];
        int swap = 0;

        for (int i=0; i<nums.length; i++){
            if (visited[i] || mp.get(arr[i][0]) == i){
                continue;
            }

            int j = i;
            int size = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = mp.get(arr[j][0]);
                size++;
            }
            swap += size - 1;
        }
        return swap;
    }
}