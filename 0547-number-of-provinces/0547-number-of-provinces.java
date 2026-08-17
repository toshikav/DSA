class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[] = new boolean[isConnected.length];
        int provinces = 0;

        for (int i=0; i<isConnected.length; i++){
            if (!visited[i]){
                dfs(i, isConnected, visited);
                provinces++;
            }
        }
        return provinces;
    }
    public void dfs(int node, int[][] isConnected, boolean visited[]){
        visited[node] = true;

        for (int i=0; i<isConnected.length; i++){
            if (!visited[i] && isConnected[node][i] == 1){
                dfs(i, isConnected, visited);
            }     
        }
    }
}