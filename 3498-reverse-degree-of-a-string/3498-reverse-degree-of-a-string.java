class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int idx = 1;

        for (int i=0; i<s.length(); i++){
            sum += (123 - (int) s.charAt(i)) * idx;
            idx++;

        }
        return sum;
    }
}