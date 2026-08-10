class Solution {
    public boolean equalFrequency(String word) {
        int freq[] = new int[26];
        for (char w : word.toCharArray()){
            freq[w - 'a']++;
        }

        for (int i=0; i<26; i++){
            if (freq[i] == 0){
                continue;
            }
            freq[i]--;

            int max = 0;
            int min = Integer.MAX_VALUE;

            for (int f : freq){
                if (f > 0){
                    min = Math.min(min, f);
                    max = Math.max(max, f);
                }
            }
            freq[i]++;
            if (min == max){
                return true;
            }
        }
        return false;
    }
}