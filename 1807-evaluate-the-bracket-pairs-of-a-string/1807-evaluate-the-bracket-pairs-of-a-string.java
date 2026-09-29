class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> mp = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (List<String> pair : knowledge){
            mp.put(pair.get(0), pair.get(1));
        }

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                
                int j = s.indexOf(')', i+1);
                ans.append(mp.getOrDefault(s.substring(i+1, j), "?"));
                i = j;
            }

            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}