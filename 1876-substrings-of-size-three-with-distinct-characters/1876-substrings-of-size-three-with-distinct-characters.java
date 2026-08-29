class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        char[] ch  = s.toCharArray();

        for (int i=0; i<ch.length - 2; i++){

            if (ch[i] != ch[i+1] && ch[i] != ch[i+2] && ch[i + 1] != ch[i+2]){
                count++;
            }
        }
        return count;
    }
}