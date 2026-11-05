class Solution {
    public int hammingWeight(int n) {
        int one = 0;

        while (n != 0){
            one += (n & 1);
            n = n>>>1;
        }
        return one;
    }
}