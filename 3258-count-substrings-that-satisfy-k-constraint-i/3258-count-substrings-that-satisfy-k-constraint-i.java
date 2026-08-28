class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int count0 = 0;
        int count1 = 0;
        int count = 0;

        for (int right=0; right<s.length(); right++){
            if (s.charAt(right) == '1'){
                count1++;
            }else{
                count0++;
            }

            while (count0 > k && count1 > k){
               
                if(s.charAt(left) == '1'){
                    count1--;
                }else{
                    count0--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}