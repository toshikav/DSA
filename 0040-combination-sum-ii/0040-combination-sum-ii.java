class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(candidates, target, ans, new ArrayList<Integer>(), 0);
        return ans;
    }

    private void backtrack(int candidates[], int target, List<List<Integer>> ans, List<Integer> list, int start){
        if (target < 0){
            return;
        }else if (target == 0){
            ans.add(new ArrayList<>(list));
        }else{
            for (int i=start; i<candidates.length; i++){
                if (i > start && candidates[i] == candidates[i-1]){
                    continue;
                }
                list.add(candidates[i]);
                backtrack(candidates, target - candidates[i], ans, list, i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}