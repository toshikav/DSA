class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        
        if (n == 1){
            return s;
        }

        char half[] = s.substring(0, n/2).toCharArray();
        Arrays.sort(half);
        String firstHalf = new String(half);
        String middle = "";

        if (n % 2 == 1){
            middle = String.valueOf(s.charAt(n/2));
        }

        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        return firstHalf + middle + secondHalf;
    }
}