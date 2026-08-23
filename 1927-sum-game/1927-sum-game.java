class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;

        int mid = num.length() / 2;

        for (int i=0; i<mid; i++){
            if (num.charAt(i) == '?'){
                leftQ++;

            }else{
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i=mid; i<num.length(); i++){
            if (num.charAt(i) == '?'){
                rightQ++;

            }else{
                rightSum += num.charAt(i) - '0';
            }
        }
        // if odd ?
        if ((leftQ + rightQ) % 2 != 0){
            return true;
        }
        // if even ?
        return 2 * (leftSum - rightSum) != 9 * (rightQ - leftQ);
    }
}