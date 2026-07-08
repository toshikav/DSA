class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<String>();
        traverse(list, "", 0, 0, n);
        return list;
        
    }
    public void traverse(List<String> list, String str, int start, int end, int max){
        if (str.length() == max * 2){
            list.add(str);
            return ;
        }

        if (start < max){
            traverse(list, str + "(", start + 1,end, max);     
        }
        if (end < start){
            traverse(list, str + ")", start, end + 1, max);
        }
    }
}