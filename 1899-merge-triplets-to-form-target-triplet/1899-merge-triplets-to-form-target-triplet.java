class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int countx=0;
        int county=0;
        int countz=0;
        for(int i=0;i<triplets.length;i++){
            int x=triplets[i][0];
            int y=triplets[i][1];
            int z=triplets[i][2];
            if(x<=target[0] && y<=target[1] && z<=target[2]){
                if(target[0]==x) countx++;
                if(target[1]==y) county++;
                if(target[2]==z) countz++;
            }
        }
        return countx!=0 && county!=0 && countz!=0;
    }
}