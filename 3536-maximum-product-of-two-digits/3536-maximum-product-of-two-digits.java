class Solution {
    public int maxProduct(int n) {
        int max = -1;
        String str = n + "";
        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                int digi1 = str.charAt(i) - '0';
                int digi2 = str.charAt(j) - '0';

                int ans = digi1 * digi2;

                max = Math.max(max, ans);
            }
        }
        return max;
    }
}