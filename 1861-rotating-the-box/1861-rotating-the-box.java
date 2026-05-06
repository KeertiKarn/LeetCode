class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m= boxGrid.length;
        int n=boxGrid[0].length;
        char[][] rotatedBox= new char[n][m];
        //first rotate the box
        for(int i=0;i<boxGrid.length;i++){
            for(int j=0;j<n;j++){
                rotatedBox[j][m - 1 - i] = boxGrid[i][j];
            }
        }
        //now check 
       for(int j=0;j<m;j++){
          int emptyRow = n - 1;
         for(int i=n-1;i>=0;i--){
              if (rotatedBox[i][j] == '*') {
                    emptyRow = i - 1;
                }

                // Stone falls downward
                else if (rotatedBox[i][j] == '#') {

                    rotatedBox[i][j] = '.';
                    rotatedBox[emptyRow][j] = '#';

                    emptyRow--;
                }
         }
       }
       return rotatedBox;
    }
}