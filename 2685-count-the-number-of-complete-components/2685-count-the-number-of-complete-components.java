class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer> graph[] = new ArrayList[n];
        int ans = 0;
        boolean visited[] = new boolean[n];

        for (int i = 0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for (int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i=0; i<n; i++){
            if (!visited[i]){

                int res[] = dfs(i, graph, visited);

                int vertices = res[0];
                int degreeSum = res[1];
                
                int edgeCount = degreeSum / 2;

            
                int requiredEdges = vertices * (vertices - 1) / 2;

                if (edgeCount == requiredEdges) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private int[] dfs(int node, List<Integer> graph[], boolean visited[]){
        visited[node]= true;

        int vertices = 1;
        int sum = graph[node].size();

        for (int next : graph[node]){
            if (!visited[next]){
                int result[] = dfs(next, graph, visited);

                vertices += result[0];
                sum += result[1];
                
            }
        }

        return new int[]{vertices, sum};
    }
}