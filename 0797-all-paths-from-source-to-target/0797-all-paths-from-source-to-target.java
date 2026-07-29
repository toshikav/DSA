class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        helper(0, graph, path);
        return ans;

    }

    private void helper(int node, int[][] graph, List<Integer> path){
        path.add(node);

        if (node == graph.length - 1){
            ans.add(new ArrayList<>(path));

        }else{
            for (int prev : graph[node]){
                helper(prev, graph, path);
            }
        }

        path.remove(path.size() -1);
    }
}