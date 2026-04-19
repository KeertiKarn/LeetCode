class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res= 0;
        for(int i=0;i<nums1.length;i++){
            int low= i;
            int high=nums2.length-1;
            int ans=-1;
            while(low<=high){
                int mid= low+(high-low)/2;
                if(nums2[mid]>=nums1[i]){
                  ans=mid;
                  low=mid+1;
                }
                else{
                     high=mid-1;
                }
            }
            if(ans!=-1) res= Math.max(res,(ans-i));
        }
        return res;
    }
}