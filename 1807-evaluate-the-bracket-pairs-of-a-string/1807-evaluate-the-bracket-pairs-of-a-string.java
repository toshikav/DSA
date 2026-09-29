class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> mp = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (List<String> pair : knowledge){
            String key = pair.get(0);
            String value = pair.get(1);

            mp.put(key, value);
        }

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != '('){
                ans.append(s.charAt(i));
            }

            else{
                int j = s.indexOf(')', i);
                String key = s.substring(i + 1, j);
                String value = mp.getOrDefault(key, "?");
                ans.append(value);
                i = j;
            }
        }
        return ans.toString();
    }
}