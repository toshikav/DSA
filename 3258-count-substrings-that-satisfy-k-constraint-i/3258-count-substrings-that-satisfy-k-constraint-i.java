class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;

        for (int i=0; i<s.length(); i++){
            int count0 = 0;
            int count1 = 0;

            for (int j=i; j<s.length(); j++){
                if (s.charAt(j) == '1'){
                    count1++;
                }else{
                    count0++;
                }

                if (count0 <= k || count1 <= k){
                    count++;
                }
            }         
        }
        return count;
    }
}