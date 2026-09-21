class Solution {
    public int countRotations(String s, int k) {
        int count = 0;

        for (int i=0; i<s.length(); i++){
            int score = 0;

            for (int j=0; j<s.length() - 1; j++){
                if (s.charAt(j) == s.charAt(j+1)){
                score++;
                }
            }
            if (score == k){
                count++;
            }
           s = rotate(s, 1);
        }
        return count;
    }
    public static String rotate(String s, int d){
        int n = s.length();

        d = d % n;

        return s.substring(d) + s.substring(0, d);
    }
}
