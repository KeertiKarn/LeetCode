class Solution {
    public void rotate(int[][] A) {
        int m=A.length;
         int n=A[0].length;
         //transpose
		for(int i=0;i<m;i++) {
			for(int j=0;j<i;j++) {
				int temp = A[i][j];
				A[i][j]=A[j][i];
				A[j][i]=temp;
		}}
         for(int i=0;i<m;i++){
		int a=0;
		int b=n-1;
		while(a<b) {
			int temp=A[i][a];
			A[i][a]=A[i][b];
			A[i][b]=temp;
			a++;
			b--;
		}
		
		}
    }
}