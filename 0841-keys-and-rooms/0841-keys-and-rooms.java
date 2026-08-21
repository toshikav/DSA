class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        dfs(0, rooms, visited);

        for (int i=0; i<rooms.size(); i++){
            if (!visited[i]){
                return false;
            }
        }
        return true;
    }
    public void dfs(int room, List<List<Integer>> rooms, boolean visited[]){
        visited[room] = true;

        for (int key : rooms.get(room)){
            if (!visited[key]){
                dfs(key, rooms, visited);
            }
        }
    }
}