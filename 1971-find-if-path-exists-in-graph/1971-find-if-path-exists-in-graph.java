class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //create adjancey list
        ArrayList<Integer>[] graph= new ArrayList[n];
        for(int i=0;i<n;i++) graph[i]= new ArrayList<Integer>();
        for(int i=0;i<edges.length;i++){
          int u=edges[i][0];
          int v=edges[i][1];
          graph[u].add(v);
          graph[v].add(u);
        }
        boolean[] visited= new boolean[n+1];
        dfs(source,graph,visited);
        return visited[destination];
    }
    public static void dfs(int source,ArrayList<Integer>[] graph,boolean[] visited){
        visited[source]=true;
        for(int next:graph[source]){
            if(!visited[next]) dfs(next,graph,visited);
        }
    }
}