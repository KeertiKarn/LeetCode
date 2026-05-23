class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int minrow= 0;
       int maxrow= matrix.length-1;
       int mincol=0;
       int maxcol= matrix[0].length-1;
       List<Integer> result= new ArrayList<>();
       while(minrow<=maxrow && mincol<=maxcol){
         int i=mincol;
         while(i<=maxcol){
            result.add(matrix[minrow][i]);
            i++;
         }
         minrow++;
         int j=minrow;
         while(j<=maxrow){
            result.add(matrix[j][maxcol]);
            j++;
         }
         maxcol--;
           if(minrow <= maxrow){
         int k=maxcol;
         while(k>=mincol){
            result.add(matrix[maxrow][k]);
            k--;
         }
         maxrow--;
           }
            if(mincol <= maxcol) {
         int l=maxrow;
         while(l>=minrow){
            result.add(matrix[l][mincol]);
            l--;
         }
         mincol++;
            }
       }
       return result;
    }
}