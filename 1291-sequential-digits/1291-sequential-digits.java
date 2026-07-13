class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String str = "123456789";
        String l = String.valueOf(low);
        String h = String.valueOf(high);

        for (int i=l.length(); i <= h.length(); i++){
            for (int j= 0; j <= 9-i; j++){
                int sub = Integer.parseInt(str.substring(j, j+i));
                if (sub >= low && sub <= high){
                    ans.add(sub);
                }
            }
        }
        return ans;
    }
}