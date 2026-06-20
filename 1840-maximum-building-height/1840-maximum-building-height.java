class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
       // int[] arr= new int[n+1]; will give MLE as n is too big
        
        //so rather than generating all the building heights individually we will first update the restriction
        
        boolean lastpresent=false;
        ArrayList<int[]> list= new ArrayList<>();
        list.add(new int[]{1,0});
        for(int[] res: restrictions) {
            list.add(res);
            if(res[0]==n) lastpresent=true;
        }
        if(!lastpresent)  list.add(new int[]{n,n-1}); //last building 

        Collections.sort(list,(a,b)->a[0]-b[0]);

        //now we will do left->right pass to tighten the bound
        //ensure each building increase only with +1
        for(int i=1;i<list.size();i++){
            int dis= list.get(i)[0]-list.get(i-1)[0];
            list.get(i)[1]= Math.min(list.get(i)[1], list.get(i-1)[1]+dis);
        }
       
        //now we will do right->left pass to tighten the bound
        //ensure each building decrease only with -1
        for(int i=list.size()-2;i>=0;i--){
            int dist=list.get(i+1)[0] - list.get(i)[0];
            list.get(i)[1] = Math.min(list.get(i)[1],list.get(i+1)[1]+dist);
        }
         
         int ans=0;
        //now we wil find the peek between two
        for(int i=0;i<list.size()-1;i++){
            int dis= list.get(i+1)[0]-list.get(i)[0];
            int peak= (list.get(i)[1]+list.get(i+1)[1]+dis)/2;
            ans= Math.max(ans,peak);
        }
        return ans;
    }
}