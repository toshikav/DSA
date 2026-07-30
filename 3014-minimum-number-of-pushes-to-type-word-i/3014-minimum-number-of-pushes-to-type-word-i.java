class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        return (n / 8 * (n / 8 + 1) * 4) + (n % 8) * (n / 8 + 1);
    }
}