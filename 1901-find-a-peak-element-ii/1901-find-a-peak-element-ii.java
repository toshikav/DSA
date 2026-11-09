class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length, start = 0, end = m-1, mid;

        while (start <= end){
            mid = start + (end - start) / 2;
            int max = 0;

            for (int i=0; i<n; ++i){
                if (mat[max][mid] < mat[i][mid]){
                    max = i;
                }
            }
            if ((mid == 0 || mat[max][mid] > mat[max][mid - 1]) && (mid == m-1 || mat[max][mid] > mat[max][mid+1])){
                return new int[] {max, mid};
            }
            else if (mid > 0 && mat[max][mid - 1] > mat[max][mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return new int[] {-1, 1};
    }
}