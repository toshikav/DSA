class Solution {
    public int countRotations(String s, int k) {
        int count = 0;
        int total = 0;
        int n = s.length();

        for (int i=0; i<n; i++){

            if (s.charAt(i) == s.charAt((i+1) % n)){
                total++;
            }
        }

        for (int i=0; i<n; i++){
            int score = total;

            if (s.charAt(i) == s.charAt((i+1) % n)){
                score--;
            }

            if (score == k){
                count++;
            }
        }
        return count;
    }
}
