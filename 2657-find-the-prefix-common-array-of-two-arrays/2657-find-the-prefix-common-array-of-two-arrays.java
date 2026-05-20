class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
      HashMap<Integer,Integer> map= new HashMap<>();
      int[] ans= new int[A.length];
      for(int i=0;i<A.length;i++){
        if(map.containsKey(A[i])) map.put(A[i],map.get(A[i])+1);
        else map.put(A[i],1);
        if(map.containsKey(B[i])) map.put(B[i],map.get(B[i])+1);
        else map.put(B[i],1);
        int count=0;
        for(int val: map.values()){
            count+=val/2;
        }
        ans[i]=count;
      }
      return ans;
    }
}