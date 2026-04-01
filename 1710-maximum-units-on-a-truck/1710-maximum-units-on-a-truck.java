class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     Arrays.sort(boxTypes,(b,a)->a[1]-b[1]);   
     int total=0;
     int i=0;
     while(truckSize>0 && i<boxTypes.length){
        int box= boxTypes[i][0];
        while(box>0 && truckSize>0){
            total+=boxTypes[i][1];
            box--;
            truckSize--;
        }
        i++;
     }
     return total;
    }
}