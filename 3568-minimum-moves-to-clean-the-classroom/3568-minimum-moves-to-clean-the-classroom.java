class Solution {
    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int startR = 0, startC = 0;

        // Give every litter cell a bit index
        int[][] litterIndex = new int[m][n];
        for (int[] row : litterIndex) {
            Arrays.fill(row, -1);
        }

        int litterCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startR = i;
                    startC = j;
                }

                if (ch == 'L') {
                    litterIndex[i][j] = litterCount++;
                }
            }
        }

        // All litter collected
        int targetMask = (1 << litterCount) - 1;

        // No litter
        if (targetMask == 0) {
            return 0;
        }

        /*
            State:
            row, col, mask, remainingEnergy, moves
        */

        Queue<int[]> queue = new LinkedList<>();

        // visited[row][col][mask][energy]
        boolean[][][][] visited =
            new boolean[m][n][1 << litterCount][energy + 1];

        queue.offer(new int[]{startR, startC, 0, energy, 0});
        visited[startR][startC][0][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            int[] state = queue.poll();

            int r = state[0];
            int c = state[1];
            int mask = state[2];
            int currEnergy = state[3];
            int moves = state[4];

            for (int d = 0; d < 4; d++) {

                int nr = r + dr[d];
                int nc = c + dc[d];

                // Outside grid
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                // Obstacle
                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                // Need one energy to make a move
                if (currEnergy == 0) {
                    continue;
                }

                int newEnergy = currEnergy - 1;
                int newMask = mask;

                char cell = classroom[nr].charAt(nc);

                // Collect litter
                if (cell == 'L') {
                    int index = litterIndex[nr][nc];
                    newMask |= (1 << index);
                }

                // Reset energy
                if (cell == 'R') {
                    newEnergy = energy;
                }

                // All litter collected
                if (newMask == targetMask) {
                    return moves + 1;
                }

                // If energy becomes 0, we can only continue
                // if we are standing on R.
                if (newEnergy == 0 && cell != 'R') {
                    continue;
                }

                if (!visited[nr][nc][newMask][newEnergy]) {

                    visited[nr][nc][newMask][newEnergy] = true;

                    queue.offer(new int[]{
                        nr,
                        nc,
                        newMask,
                        newEnergy,
                        moves + 1
                    });
                }
            }
        }

        return -1;
    }
}