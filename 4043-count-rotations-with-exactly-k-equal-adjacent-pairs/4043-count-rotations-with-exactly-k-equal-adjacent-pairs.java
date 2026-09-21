class Solution {
    public int countRotations(String s, int k) {
        int count = 0;
        int total = 0;

        for (int i=0; i<s.length(); i++){

            if (s.charAt(i) == s.charAt((i+1) % s.length())){
                total++;
            }
        }

        for (int i=0; i<s.length(); i++){
            int score = total;

            if (s.charAt(i) == s.charAt((i+1) % s.length())){
                score--;
            }

            if (score == k){
                count++;
            }
        }
        return count;
    }
}
