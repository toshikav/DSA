class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int freq[] = new int[26];

        for (char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for (char ch : target.toCharArray()){
            freq[ch - 'a']--;
        }

        for (int i=target.length() - 1; i >= 0; i--){
            int curr = target.charAt(i) - 'a';
            freq[curr]++;

            boolean temp = true;
            for (int f : freq){
                if (f < 0){
                    temp = false;
                    break;
                }
            }

            if (!temp){
                continue;
            }
            int next = -1;

            for (int j=curr+1; j<26; j++){
                if (freq[j] > 0){
                    next = j;
                    break;
                }
            }

            if (next == -1){
                continue;
            }
            freq[next]--;

            StringBuilder ans = new StringBuilder(target.substring(0, i));
            ans.append((char)('a' + next));

            for (int j = 0; j<26; j++){
                while (freq[j]-- > 0){
                    ans.append((char)('a' + j));
                }
            }

            return ans.toString();
        }
        return "";
    }
}