class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(0, graph, ans, path);
        return ans;

    }

    private void helper(int node, int[][] graph, List<List<Integer>> ans, List<Integer> path){
        path.add(node);

        if (node == graph.length - 1){
            ans.add(new ArrayList<>(path));

        }
        else{
            for (int prev : graph[node]){
                helper(prev, graph, ans, path);
            }
        }

        path.remove(path.size() -1);
    }
}