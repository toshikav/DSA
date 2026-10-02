class Solution {
    public List<Integer> getRow(int rowIndex) {
        long x = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add((int) x);

        for (int i=0; i<rowIndex; i++){
            x *= (rowIndex - i);
            x /= (i + 1);
            list.add((int)x);
        }

        return list;        
    }
}