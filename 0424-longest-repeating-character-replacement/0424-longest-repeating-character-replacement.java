class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxF = 0;
        int maxL = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()){
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            maxF = Math.max(maxF, freq[ch - 'A']);

            if ((right - left + 1) - maxF > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxL = Math.max(maxL, (right - left + 1));
            right++;
        }
        return maxL;
    }
}