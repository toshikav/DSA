class Solution {
    public boolean stoneGame(int[] piles) {
        Integer res[][] = new Integer[piles.length][piles.length];
        return helper(piles, 0, piles.length - 1, res) > 0;
    }
    public int helper(int piles[], int left, int right, Integer res[][]){
        if (left == right){
            return piles[left];
        }

        if (res[left][right] != null){
            return res[left][right];
        }

        int pickLeft = piles[left] - helper(piles, left + 1, right, res);
        int pickRight = piles[right] - helper(piles, left, right - 1, res);

        res[left][right] = Math.max(pickLeft, pickRight);

        return res[left][right];
    }
}