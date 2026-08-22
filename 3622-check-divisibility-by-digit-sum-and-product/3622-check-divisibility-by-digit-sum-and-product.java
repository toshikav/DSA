class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        long sum = 0;
        long prod = 1;
        

        while (n > 0){
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        if (original % (sum +  prod) == 0){
            return true;
        }
        return false;
    }
}