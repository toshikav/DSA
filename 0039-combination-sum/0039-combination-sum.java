class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<>(), 0, target, candidates);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int start, int remain, int candidates[]){
        if (remain < 0){
            return;
        }
        else if (remain == 0){
            ans.add(new ArrayList<>(temp));
        }
        else{
            for (int i=start; i<candidates.length; i++){
                temp.add(candidates[i]);
                backtrack(ans, temp, i, remain - candidates[i], candidates);
                temp.remove(temp.size() - 1);
            } 
        }    
    }
}