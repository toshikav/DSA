class Solution {
    public int smallestNumber(int n, int t) {
        while (digitProd(n) % t != 0){
            n++;
        }
        return n;
    }
    private int digitProd(int num){
        int prod = 1;

        while (num > 0){
            prod *= (num % 10);
            num /= 10;
        }
        return prod;
    }
}