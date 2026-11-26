class Solution {
    public boolean canAliceWin(int n) {
        int left = 55 - n;
        if (n < 10){
            return false;
        }

        long unplayed = Math.round(Math.sqrt(2 * left));
        return unplayed % 2 == 1;

    }
}