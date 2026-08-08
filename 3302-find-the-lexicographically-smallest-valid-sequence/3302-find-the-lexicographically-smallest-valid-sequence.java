class Solution {
    public int[] validSequence(String word1, String word2) {
        int dp[] = new int[word1.length() + 1];
        int ans[] = new int[word2.length()];

        for (int i=word1.length() - 1; i>=0; i--){
            dp[i] = dp[i+1];

            if (dp[i+1] < word2.length() && word1.charAt(i) == word2.charAt(word2.length() - dp[i+1] - 1)){
                dp[i]++;
            }
        }

        int idx = 0;
        int start = 0;
        boolean mismatch = false;

        while(idx < word2.length()){
            boolean found = false;

            for (int i=start; i<word1.length(); i++){
                if (word1.charAt(i) == word2.charAt(idx)){
                    ans[idx] = i;
                    start = i+1;
                    idx++;
                    found = true;
                    break;
                }

                if(!mismatch){
                    int remaining = word2.length() - idx - 1;

                    if(dp[i+1] >= remaining){
                        ans[idx] = i;
                        start= i+1;
                        idx++;
                        mismatch = true;
                        found = true;
                        break;
                    }
                }
            }
            if (!found ){
                return new int[0];
            }
        }
        return ans;
    }
}