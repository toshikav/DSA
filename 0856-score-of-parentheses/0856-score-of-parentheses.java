class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);

       for (char c : s.toCharArray()){
        if (c == '('){
            stk.push(0);
        }
        else{
            int inside = stk.pop();
            int outer = stk.pop();

            stk.push(outer + Math.max(2 * inside, 1));
        }
       }
        return stk.pop();
    }
}