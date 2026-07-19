class Solution {
    public String smallestSubsequence(String s) {
        boolean visited[] = new boolean[26];
        int freq[] = new int[26];

        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for (char ch : s.toCharArray()){
            freq[ch - 'a'] --;

            if (visited[ch - 'a']){
                continue;
            }

            while (!stk.isEmpty() && stk.peek() > ch && freq[stk.peek() - 'a'] > 0){
                visited[stk.pop() - 'a'] = false;
            }

            stk.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stk){
            ans.append(c);
        }
        return ans.toString();
    }
}