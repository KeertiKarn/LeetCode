class Solution {
    public void setZeroes(int[][] matrix) {
       int[] row= new int[matrix.length];
       int[] col= new int[matrix[0].length];
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                row[i]++;
                col[j]++;
            }
        }
       }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]>0 || col[j]>0) matrix[i][j]=0;
            }
        }
       
    }
}