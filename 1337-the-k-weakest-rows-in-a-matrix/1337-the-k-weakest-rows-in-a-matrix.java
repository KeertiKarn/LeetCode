class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soilder= new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1) count++;
                else break;
            }
            soilder[i]=count;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->{
            if(soilder[a]==soilder[b]) return a-b;
            return soilder[a]-soilder[b];
    });
        for(int i=0;i<soilder.length;i++) pq.add(i);
       int[] res= new int[k];
       int i=0;
       while(!pq.isEmpty() && k>0){
          int ele= pq.remove();
          res[i]=ele;
          i++;
          k--;
        }
      
        return res;
        
    }
}