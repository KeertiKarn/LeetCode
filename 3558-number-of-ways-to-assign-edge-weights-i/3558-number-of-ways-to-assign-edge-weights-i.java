class Solution {
    int maxDepth=0;
    static final int MOD = 1_000_000_007;
    public void dfs(int node,int parent,int depth,List<List<Integer>> adj){
       //update maxDepth
       maxDepth= Math.max(maxDepth,depth);
       
       //visit the neighbours
       for(int nei: adj.get(node)){
        //dont go back to parent since going back causes infinite loop
        if(nei!=parent){
            dfs(nei,node,depth+1,adj); //depth now increases by 1
        }
       }
    }

    public int assignEdgeWeights(int[][] edges) {
       //If number of edges is n then the number of nodes is n+1
       int n= edges.length+1;
       //adjency list contains idx->neighbours
       List<List<Integer>> adj = new ArrayList<>();
       //for all node create empty list of neighours
       for(int i=0;i<=n;i++){
        adj.add(new ArrayList<>());
       }
       //now add neighbours
       for(int i=0;i<edges.length;i++){
        int u= edges[i][0];
        int v= edges[i][1];
        //adding both because tree is undirected
        adj.get(u).add(v);
        adj.get(v).add(u);
       }
       //now we do dfs for finding maxDepth
       //since 1 is root node and there is no parent node so its -1 and current depth is 0
       dfs(1,-1,0,adj);
       
       //since answer is 2^(maxdepth-1)
       long ans =1;
       for(int i=1;i<maxDepth;i++){
        ans=(ans*2)%MOD;
       }
       return (int)ans;
    }
}