class Solution {
    public String reverseParentheses(String s) {
        int pair[] = new int[s.length()];
        Deque<Integer> q = new ArrayDeque<>();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                q.push(i);
            }else if (s.charAt(i) == ')'){
                int j = q.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i=0;
        int temp = 1;

        while (i >=0 && i < s.length()){
            if (s.charAt(i) == '(' || s.charAt(i) == ')'){
                i = pair[i];
                temp = -temp;
            }
            else{
                ans.append(s.charAt(i));
            }

            i+=temp;
        }

        return ans.toString();
    }
}