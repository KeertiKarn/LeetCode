class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                List<Integer> temp= map.get(nums[i]);
                temp.add(i);
                map.put(nums[i],temp);
            }
            else{
                List<Integer> list= new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        long[] ans= new long[nums.length];
        for(List<Integer> list : map.values()){
            //prefix sum to calculate sumofLeft elements
            long[] prefix= new long[list.size()];
            prefix[0]=list.get(0);
            for(int i=1;i<list.size();i++) prefix[i]=prefix[i-1]+list.get(i);
            
            //suffix sum to calculate sum of right elements
            long[] suffix= new long[list.size()];
            suffix[suffix.length-1]=list.get(list.size()-1);
            for(int i=list.size()-2;i>=0;i--) suffix[i]=suffix[i+1]+list.get(i);


            for(int i=0;i<list.size();i++){
                int n= list.get(i); //idx number

                long sumOfLeft= 0;
                if(i>0) sumOfLeft= prefix[i-1];
                long left= (long)i*n - (sumOfLeft); //here count=i which is no of elements to left

                long sumOfRight= 0;
                if(i<suffix.length-1) sumOfRight= suffix[i+1];
                int count= (list.size()-i-1);
                long right = sumOfRight - (long)count*n;

                ans[n]=left+right;
            }

        }
        return ans;
    }
}