class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        
        for (int i=0; i<nums.size(); i++){
            HashSet<Integer> arr = new HashSet<>();
            for (int j=i; j<nums.size(); j++){          
                arr.add(nums.get(j));
                int count = arr.size();
                sum += count * count;
            }
        }
        return sum;
    }
}