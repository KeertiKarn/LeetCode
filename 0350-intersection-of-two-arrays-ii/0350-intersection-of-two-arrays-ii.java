class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer> map= new HashMap<>();
     for(int ele: nums1){
        if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
        else map.put(ele,1);
     }  
     List<Integer> ans= new ArrayList<>(); 
     for(int i=0;i<nums2.length;i++){
        if(map.containsKey(nums2[i])){
            ans.add(nums2[i]);
            int freq= map.get(nums2[i])-1;
            if(freq>0) map.put(nums2[i],freq);
            else map.remove(nums2[i]);
        }
     }
     int[] res= new int[ans.size()];
     for(int i=0;i<ans.size();i++){
        res[i]= ans.get(i);
     }
     return res;
    }

}