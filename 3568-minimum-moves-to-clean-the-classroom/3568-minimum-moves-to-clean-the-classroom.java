class Solution {
    public int minMoves(String[] classroom, int energy) {
        int count = 0;
        int m = classroom.length; 
        int n = classroom[0].length();
        int litter[][] = new int[m][n];
        int x = -1;
        int y = -1;

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                char c = classroom[i].charAt(j);

                if (c == 'S'){
                    x = i;
                    y = j;

                }else if (c == 'L'){
                    litter[i][j] = count++;
                }
            }
        }
        if (count == 0){
            return 0;
        }

        int target = (1 << count) - 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, energy, 0, 0});
        
        boolean[][][][] visited = new boolean[m][n][energy + 1][1 << count];
        visited[x][y][energy][0] = true;

        int direction[] = {-1, 0, 1, 0, -1};

        while (!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];
            int e = curr[2];
            int mask = curr[3];
            int steps = curr[4];

            for (int i=0; i<4; i++){
                int nr = r + direction[i];
                int nc = c + direction[i+1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && classroom[nr].charAt(nc) != 'X'){
                    int nextE = e - 1;
                    int nextMask = mask;
                    char next = classroom[nr].charAt(nc);

                    if (next == 'L'){
                        nextMask |= (1 << litter[nr][nc]);
                    }

                    if (nextMask == target) {
                        return steps + 1;
                    }
                    
                    if (next == 'R') {
                        nextE = energy;
                    }
                    
                    if (nextE == 0 && next != 'R') continue;
                    
                    if (!visited[nr][nc][nextE][nextMask]) {
                        visited[nr][nc][nextE][nextMask] = true;
                        q.offer(new int[]{nr, nc, nextE, nextMask, steps + 1});
                    }
                }
            }  
        }
        return -1;
    }
}