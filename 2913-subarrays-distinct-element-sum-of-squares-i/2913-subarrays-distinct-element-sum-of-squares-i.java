class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        
        for (int i=0; i<nums.size(); i++){
            for (int j=i; j<nums.size(); j++){

                HashSet<Integer> arr = new HashSet<>();
                for (int k=i; k<=j; k++){
                    arr.add(nums.get(k));
                }
                int count = arr.size();
                sum += count * count;
            }
        }
        return sum;
    }
}