class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[arr.length];
        long res = 0;
        long MOD = (long) 1000000007;

        for (int i=0; i<arr.length; i++){
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
           
            if (stk.isEmpty()){
                ans[i] =  arr[i] * (i+1);
            }
            else{
                int j = stk.peek();
                ans[i] = ans[j] + arr[i] * (i-j);
            }
            stk.push(i);
            res = (res + ans[i]) % MOD;
        }
        
        return (int) res;
    }
}