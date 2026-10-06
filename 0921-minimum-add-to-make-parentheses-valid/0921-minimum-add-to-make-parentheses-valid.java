class Solution {
    public int minAddToMakeValid(String s) {
        char[] stk = new char[s.length()];
        int count = 0;

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if (c == ')' && count > 0 && stk[count - 1] == '('){
                count--;
            }
            else{
                stk[count++] = c;
            }
        }
        return count;
    }
}