class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();

        for (int a : asteroids){
            if (a > 0){
                stk.push(a);
            }
            else{
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < -a){
                    stk.pop();
                }

                if (stk.isEmpty() || stk.peek() < 0){
                    stk.push(a);
                }

                if (stk.peek() == -a){
                    stk.pop();
                }
            }
        }
        int ans[] = new int[stk.size()];
        int i = stk.size() - 1;

        while (!stk.isEmpty()){
            ans[i--] = stk.pop();
        }

        return ans;
    }
}