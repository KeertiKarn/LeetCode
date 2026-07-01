class Solution {

    int n;
    int[][] dist;
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {

        n = grid.size();
        dist = new int[n][n];

        for(int[] row : dist)
            Arrays.fill(row, Integer.MAX_VALUE);

        Queue<int[]> q = new LinkedList<>();

        // Multi Source BFS
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid.get(i).get(j) == 1){
                    dist[i][j] = 0;
                    q.offer(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){

            int[] cur = q.poll();

            int r = cur[0];
            int c = cur[1];

            for(int[] d : dir){

                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nc < 0 || nr >= n || nc >= n)
                    continue;

                if(dist[nr][nc] > dist[r][c] + 1){

                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }

        int low = 0;
        int high = 2 * n;
        int ans = 0;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canReach(mid)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canReach(int safe){

        if(dist[0][0] < safe)
            return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];

        q.offer(new int[]{0,0});
        vis[0][0] = true;

        while(!q.isEmpty()){

            int[] cur = q.poll();

            int r = cur[0];
            int c = cur[1];

            if(r == n-1 && c == n-1)
                return true;

            for(int[] d : dir){

                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nc < 0 || nr >= n || nc >= n)
                    continue;

                if(vis[nr][nc])
                    continue;

                if(dist[nr][nc] < safe)
                    continue;

                vis[nr][nc] = true;
                q.offer(new int[]{nr,nc});
            }
        }

        return false;
    }
}