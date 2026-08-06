class Solution {
    public int smallestNumber(int n, int t) {
        while (true){
            int prod = digitProd(n);

            if (prod % t == 0){
                return n;
            }
            n++;
        }
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