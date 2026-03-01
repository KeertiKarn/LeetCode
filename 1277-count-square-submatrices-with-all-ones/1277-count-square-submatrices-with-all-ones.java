class Solution {
    public int countSquares(int[][] matrix) {
        int row= matrix.length;
        int column= matrix[0].length;
        int count=0;
        for(int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                if(matrix[i][j]==1){
                    if(matrix[i-1][j-1]!=0 && matrix[i][j-1]!=0 && matrix[i-1][j]!=0) 
                    matrix[i][j] += Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j], matrix[i][j-1]));
                } 
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               if(matrix[i][j]!=0) count += matrix[i][j];
            }
        }
        return count;

    }
}