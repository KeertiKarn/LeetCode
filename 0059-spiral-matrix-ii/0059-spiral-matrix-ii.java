class Solution {
    public int[][] generateMatrix(int n) {
       int[][] matrix= new int[n][n];
       int minrow= 0;
       int maxrow= n-1;
       int mincol=0;
       int maxcol= n-1;
       int ele=1;
       while(minrow<=maxrow && mincol<=maxcol){
         int i=mincol;
         while(i<=maxcol){
            matrix[minrow][i]=ele;
            ele++;
            i++;
         }
         minrow++;
         int j=minrow;
         while(j<=maxrow){
            matrix[j][maxcol]=ele;
            ele++;
            j++;
         }
         maxcol--;
           if(minrow <= maxrow){
         int k=maxcol;
         while(k>=mincol){
            matrix[maxrow][k]=ele;
            ele++;
            k--;
         }
         maxrow--;
           }
            if(mincol <= maxcol) {
         int l=maxrow;
         while(l>=minrow){
           matrix[l][mincol]=ele;
           ele++;
            l--;
         }
         mincol++;
            }
       }
       return matrix;
    }
} 
   
