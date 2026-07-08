class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long evenPositions = (n+1) / 2;
        long oddPositions = n/2;
        long MOD = 1000000007;

        return (int)((expo(5, evenPositions) * expo(4, oddPositions)) % MOD);
    }

    long expo(long base, long power){
        long ans = 1;

        while (power > 0){
            if (power % 2 == 1){
                ans = (ans * base) % MOD;
            }

            base = (base * base) % MOD;
            power /=2;
        }
        return ans;
    }
}