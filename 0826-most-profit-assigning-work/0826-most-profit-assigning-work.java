class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        int[][] temp= new int[n][2];
        for(int i=0;i<n;i++){
            temp[i][0]= difficulty[i];
            temp[i][1]= profit[i];
        }
        Arrays.sort(temp,(a,b)-> Integer.compare(a[0],b[0]));
        Arrays.sort(worker);
        int maxprofit=0;
        int total=0;
        int j=0;
        for(int i=0;i<worker.length;i++){
            while(j<n && temp[j][0]<=worker[i]){
                maxprofit= Math.max(maxprofit,temp[j][1]);
                j++;
            }
            total += maxprofit;
        }
        return total;

    }
}