class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i=0; i<=s.length()-3; i++){
            HashSet<Character> sub = new HashSet<>();
            sub.add(s.charAt(i));
            sub.add(s.charAt(i + 1));
            sub.add(s.charAt(i + 2));

            if (sub.size() == 3){
                count++;
            }
        }
        return count;
    }
}