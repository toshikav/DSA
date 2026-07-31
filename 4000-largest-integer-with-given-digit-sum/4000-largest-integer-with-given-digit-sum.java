class Solution {
    public int largestInteger(int n, int s) {
        StringBuilder ans = new StringBuilder();

        if (s == 0){
            return 0;
        }
        if (s > 9*n){
            return -1;
        }

        for (int i=0; i<n; i++){
            int digit = Math.min(9, s);
            ans.append(digit);
            s -= digit;
        }

        return Integer.parseInt(ans.toString());
    }
}