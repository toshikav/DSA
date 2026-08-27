class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[] = new int[code.length];
        
        if (k==0){
            return ans;
        }

        for (int i=0; i<code.length; i++){
            int sum = 0;
            if (k > 0){
                for (int j=1; j<=k; j++){
                    int idx = (i+j) % code.length;
                    sum += code[idx];
                }
            }
            else{
                for (int j=1; j<=-k; j++){
                    int idx = (i - j + code.length) % code.length;
                    sum += code[idx];
                }
            }
            ans[i] = sum;        
        }
        return ans;
       
    }
}