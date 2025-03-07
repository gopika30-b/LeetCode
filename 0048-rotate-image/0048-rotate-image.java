class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int left=0;
        int right = m-1;
        while(left<right){
            for(int i=0; i<n; i++){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp; 
            }
            left++;
            right--;
        }
    }
}