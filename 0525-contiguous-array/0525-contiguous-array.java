class Solution {
    public int findMaxLength(int[] nums) {
        int[] prefix= new int[nums.length];
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        int sum=0;
        List<Integer> l= new ArrayList<>();
        l.add(-1);
        map.put(0,l);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) sum++;
            else sum--;
            prefix[i]=sum;
            if(map.containsKey(prefix[i])){
                List<Integer> temp= map.get(prefix[i]);
                temp.add(i);
                map.put(prefix[i],temp);
            }
            else{
                List<Integer> li= new ArrayList<>();
                li.add(i);
                map.put(prefix[i],li);
            }
        }
        int ans=0;
        for(int ele:map.keySet()){
            List<Integer> temp= map.get(ele);
             if(temp.size()>=2){
                int start= temp.get(0);
                int end= temp.get(temp.size()-1);
                ans= Math.max(ans,end-start);
            }
        }
        return ans;
       
    }
}