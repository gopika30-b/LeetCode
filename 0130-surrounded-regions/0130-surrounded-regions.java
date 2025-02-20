class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        for(int i=0; i<n; i++){
            if(vis[i][0]==0 && board[i][0]=='O') bfs(board, n, m, i, 0, vis);
            if(vis[i][m-1]==0 && board[i][m-1]=='O') bfs(board, n, m, i, m-1, vis);
        }
        for(int j=0; j<m; j++){
            if(vis[0][j]==0 && board[0][j]=='O') bfs(board, n, m, 0, j, vis);
            if(vis[n-1][j]==0 && board[n-1][j]=='O') bfs(board, n, m, n-1, j, vis);
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && board[i][j]=='O') board[i][j] = 'X';
            }
        }
    }
    public void bfs(char[][] board, int n, int m, int r, int c, int[][] vis){
        int[] rd = {-1, 1, 0, 0};
        int[] cd = {0, 0, -1, 1};
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(r,c));
        while(!queue.isEmpty()){
            int ro = queue.peek().first;
            int co = queue.peek().second;
            queue.poll();
            vis[ro][co] = 1;
            for(int i=0; i<4; i++){
                int row = ro + rd[i];
                int col = co + cd[i];
                if(row>=0 && row<n && col>=0 && col<m && board[row][col]=='O' && vis[row][col]==0){
                    vis[row][col]=1;
                    queue.add(new Pair(row, col));
                }
            }
        }
    }
}
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}