class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int startA = day(arriveAlice, days);
        int endA = day(leaveAlice, days);
        int startB = day(arriveBob, days);
        int endB = day(leaveBob, days);
        
        int start = Math.max(startA, startB);
        int end = Math.min(endA, endB);

        return start <= end ? end - start + 1 : 0;
    }
    private int day(String s, int days[]){
        int month = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        int day = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');

        int res = day;

        for (int i=0; i<month - 1; i++){
            res += days[i];
        }
        return res;
    }
}
