class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int ans [] = new int[seq.length()];
        int grp = 1;

        for (int i=0; i<seq.length(); i++){
            char bracket = seq.charAt(i);

            if (bracket == '('){
                ans[i] = 1 - grp;
            }
            else{
                ans[i] = grp;
            }
            grp ^= 1;
        }
        return ans;
    }
}