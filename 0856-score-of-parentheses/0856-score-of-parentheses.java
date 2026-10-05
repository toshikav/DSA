class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        Stack<Integer> stk = new Stack<>();

        for (int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            if (c == '('){
                stk.push(score);
                score = 0;
            }
            else {
                score = stk.pop() + Math.max(2 * score , 1);
            }
        }
        return score;
    }
}