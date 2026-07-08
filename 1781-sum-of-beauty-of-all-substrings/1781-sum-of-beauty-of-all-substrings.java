class Solution {
    public int beautySum(String s) {
        int ans = 0;

        for (int i=0; i<s.length(); i++){
            int freq[] = new int[26];

            for (int j=i; j<s.length(); j++){
                char c = s.charAt(j);

                freq[c - 'a']++;

                int maxF = Integer.MIN_VALUE;
                int minF = Integer.MAX_VALUE;

                for (int k=0; k<26; k++){
                    if (freq[k] > 0){
                        maxF = Math.max(maxF, freq[k]);
                        minF = Math.min(minF, freq[k]);
                    }
                }
                ans += maxF - minF;
            }
        }
        return ans;
    }
}