class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        
        for (int i=0; i<k; i++ ){
            sum += cardPoints[i];
        }
        int score = sum;
       int left = k-1; 
       int right = cardPoints.length - 1;

       while (left >= 0){
        sum = sum - cardPoints[left] + cardPoints[right];

        score = Math.max(score, sum);
        left--;
        right--;
       }
       return score;
    }
}