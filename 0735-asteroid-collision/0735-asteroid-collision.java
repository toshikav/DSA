class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();

        for (int a : asteroids){
            boolean alive = true;
           
           
                while (!stk.isEmpty() && a < 0 && stk.peek() > 0){
                    if (stk.peek() < -a){
                        stk.pop();
                        continue;
                    }
                    else if (stk.peek() == -a){
                        stk.pop();
                    }
                    alive = false;
                    break;
                }

                if (alive){
                    stk.push(a);
                }
        }

        int ans[] = new int[stk.size()];

       for (int i=stk.size() - 1; i>=0; --i){
        ans[i] = stk.pop();
       }

        return ans;
    }
}