class Solution {
    public int numDistinct(String s, String t) {
        int memo[][] = new int[s.length()][t.length()];

        for(int row[] : memo){
            java.util.Arrays.fill(row, -1);
        }

        return recursion(0, 0, s, t, memo);
    }

    public int recursion(int i, int j, String s, String t, int[][] memo){
        if (j == t.length()){
            return 1;
        }
        if (i == s.length()){
            return 0;
        }
        if (memo[i][j] != -1){
            return memo[i][j];
        }

        int take = 0;
        int notTake = recursion(i+1, j, s, t, memo);

        if (s.charAt(i) == t.charAt(j)){
            take = recursion(i+1, j+1, s, t, memo);
        }

        return memo[i][j] = take + notTake;
    }
}