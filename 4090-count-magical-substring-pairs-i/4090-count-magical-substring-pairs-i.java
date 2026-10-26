class Solution {
    public int countMagicalPairs(String s) {
        int ans = 0;
        
        for (int i = 0; i < s.length() - 1 ; i++){
            long left[] = new long[27];
            long right[] = new long[27];
            boolean seen[] = new boolean[26];
            int distinct = 0;

            for (int j=i; j>=0; j--){
                int c = s.charAt(j) - 'a';
                if (!seen[c]){
                    seen[c] = true;
                    distinct++;
                }
                left[distinct]++;
            }
            seen = new boolean[26];
            distinct = 0;

            for (int k=i+1; k<s.length(); k++){
                int c = s.charAt(k) - 'a';
                if (!seen[c]){
                    seen[c] = true;
                    distinct++;
                }
                right[distinct]++;
            }
            for (int d = 1; d <= 26; d++) {
                ans += left[d] * right[d];
            }          
        }
        return ans;
        
    }
}