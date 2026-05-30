class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n=matrix[0].length;
        int col=n-1;
        int row=0;
        while(col>=0 && row<m){
            if(target==matrix[row][col]) return true;
            else if(target<matrix[row][col]) col--;
            else row++;
        }
        return false;
    }
}