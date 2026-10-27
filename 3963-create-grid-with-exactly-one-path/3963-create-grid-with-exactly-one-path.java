class Solution {
    public String[] createGrid(int m, int n) {
        String ans[] = new String[m];

        for (int i=0; i<m; i++){
            ans[i] = new String(".");

            for (int j=0; j<n-1; j++){
                if (i == m-1){
                    ans[i] = ans[i] + ".";
                }else{
                    ans[i] = ans[i] + "#";
                }
            }
        }
        return ans;
    }
}