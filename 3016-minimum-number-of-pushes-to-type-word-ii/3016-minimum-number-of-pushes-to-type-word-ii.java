class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        int ans = 0;
        for (char w : word.toCharArray()){
            freq[w - 'a']++;
        }

        Arrays.sort(freq);
        for (int i=25; i >= 0 && freq[i] > 0; i--){
            ans += freq[i] * ((25 - i) / 8 + 1);
        }
        return ans;
    }
}