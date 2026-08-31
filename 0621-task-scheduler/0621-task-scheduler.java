class Solution {
    public int leastInterval(char[] tasks, int n) {
        //Mathematical greedy solution
        //can also do using pq 
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ele: tasks){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        int max=Integer.MIN_VALUE;
        for(char key:map.keySet()){
            int val=map.get(key);
            max=Math.max(val,max);
        }
        int count=0;
        for(char key:map.keySet()){
            if(map.get(key)==max) count++;
        }
        int result= (max-1)*(n+1)+count;
        return Math.max(result,tasks.length);
    }
}