class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int idx = 0;
        int ans = 0;

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            mp.put(c, mp.getOrDefault(c, 0) + 1);

            while (mp.get(c) > 2){
                char left = s.charAt(idx);
                mp.put(left, mp.get(left) - 1);
                idx++;
            }
            ans = Math.max(ans, i - idx + 1);
        }
        return ans;
    }
}