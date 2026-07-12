class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int dupli[] = arr.clone();
        Arrays.sort(dupli);

        int idx = 0;
        for (int x : dupli){
            if (idx == 0 || dupli[idx - 1] != x){
                dupli[idx++] = x;
            }
        }
        int temp[] = Arrays.copyOf(dupli, idx);
        for (int i=0; i<arr.length; i++){
            arr[i] = Arrays.binarySearch(temp, arr[i]) + 1;
        }

        return arr;
    }
}