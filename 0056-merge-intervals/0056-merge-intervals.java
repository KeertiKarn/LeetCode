class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> merge= new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        while(i<intervals.length){
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(i<intervals.length-1 && end>=intervals[i+1][0]){
                end=Math.max(end,intervals[i+1][1]);
                i++;
            }
            merge.add(new int[]{start,end});
            i++;
        }
        int[][] result= new int[merge.size()][2];
        for(int j=0;j<merge.size();j++){
            int[] temp= merge.get(j);
            result[j][0]=temp[0];
            result[j][1]=temp[1];
        }
        return result;
    }
}