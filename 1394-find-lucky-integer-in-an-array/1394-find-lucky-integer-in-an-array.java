class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele: arr){
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele,1);
        }
        int ans=Integer.MIN_VALUE;
        for(int ele:map.keySet()){
            if(ele==map.get(ele))  ans=Math.max(ele,ans);
        }
        if(ans!=Integer.MIN_VALUE) return ans;
        return -1;
    }
}