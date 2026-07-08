class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for (char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0) + 1);
        }

        List<Character> list = new ArrayList<>(mp.keySet());

        Collections.sort(list, (a,b) -> mp.get(b) - mp.get(a));

        StringBuilder ans = new StringBuilder();

        for (char ch : list){
            int freq = mp.get(ch);

            while (freq > 0){
                ans.append(ch);
                freq--;
            }
        }
        return ans.toString();
    }
}