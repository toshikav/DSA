class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxF = 0;
        int maxL = 0;
        int left = 0;
        
            for (int right=0; right<s.length(); right++){

                int idx = s.charAt(right) - 'A';
                freq[idx]++;

                maxF = Math.max(maxF, freq[idx]);

                int windowL = right - left + 1;
                int replacement = windowL - maxF;

                if (replacement > k){
                    freq[s.charAt(left) - 'A']--;
                    left++;
                }
               maxL = Math.max(maxL, right - left + 1);
            }
            
        
        return maxL;
    }
}