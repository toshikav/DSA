class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0  || s.length() < t.length()){
            return new String();
        }

        int mp[] = new int[128];
        int count = t.length();
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int idx = 0;

        for (char c : t.toCharArray()){
            mp[c]++;
        }

        char arr[] = s.toCharArray();

        while (right <arr.length){
            if (mp[arr[right++]]-- > 0){
                count--;
            }

            while (count == 0){
                if (right - left < min){
                    idx = left;
                    min = right - left;
                }

                if (mp[arr[left++]]++ == 0){
                    count++;
                }
            }
        }

        return min == Integer.MAX_VALUE ? new String() : new String(arr, idx, min);
    }
}