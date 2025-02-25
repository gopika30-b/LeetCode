class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] boxI = new HashSet[9];
        for(int i=0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            boxI[i] = new HashSet<>();
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') continue;
                char val = board[i][j];
                int ind = (i/3)*3+(j/3);
                if(row[i].contains(val) || col[j].contains(val) || boxI[ind].contains(val)) return false;
                row[i].add(val);
                col[j].add(val);
                boxI[ind].add(val);
            }
        }
        return true;
    }
}