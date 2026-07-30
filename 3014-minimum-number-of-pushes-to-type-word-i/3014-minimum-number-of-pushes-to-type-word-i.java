class Solution {
    public int minimumPushes(String word) {
        int blocks = word.length() / 8;

        return (blocks * (blocks + 1) * 4) + (word.length() % 8) * (blocks + 1);
    }
}