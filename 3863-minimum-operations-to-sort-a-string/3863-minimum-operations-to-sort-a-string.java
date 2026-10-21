class Solution {
    public int minOperations(String s) {
        char arr[] = s.toCharArray();
        char sortedArr[] = s.toCharArray();
        Arrays.sort(sortedArr);
        String sorted = new String(sortedArr);

        int n = s.length();

        if (s.equals(sorted)) return 0;
        if (n == 2) return -1;
        if (s.charAt(0) == sorted.charAt(0) || s.charAt(n-1) == sorted.charAt(n-1)) return 1;
        
        Arrays.sort(arr, 0, n-1);
        Arrays.sort(arr, 1, n);

        if (new String(arr).equals(sorted)) return 2;
        
        arr = s.toCharArray();

        Arrays.sort(arr, 1, n);
        Arrays.sort(arr, 0, n-1);

        if (new String(arr).equals(sorted)) return 2;

        return 3;
    }
}