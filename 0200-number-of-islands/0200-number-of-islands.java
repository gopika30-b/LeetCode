class Solution {
    int[] rd = { -1, 1, 0, 0 };
    int[] cd = { 0, 0, -1, 1 };

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    bfs(grid, n, m, i, j);
                }
            }
        }
        return res;
    }

    public void bfs(char[][] grid, int n, int m, int r, int c) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(r, c));
        while (!queue.isEmpty()) {
            int ro = queue.peek().first;
            int co = queue.peek().second;
            queue.poll();
            for (int i = 0; i < 4; i++) {
                int row = ro + rd[i];
                int col = co + cd[i];
                if (row >= 0 && row < n && col >= 0 && col < m && grid[row][col] == '1') {
                    grid[row][col] = '0';
                    queue.add(new Pair(row, col));
                }
            }
        }
    }
}

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}