class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), ans);
        return ans;
    }
    private void backtrack(String s, int start, List<String> list, List<List<String>> ans){
        if (start == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i=start + 1; i<=s.length(); i++){
            if (isPalindrome(s, start, i-1)){
                list.add(s.substring(start, i));

                backtrack(s, i, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int start, int end){
        while (start < end){
            if (s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}