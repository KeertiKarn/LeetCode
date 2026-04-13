class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
      int[] freq= new int[101];
      HashSet<Integer> set= new HashSet<>();
      for(int i=0;i<nums1.length;i++){
        if(!set.contains(nums1[i])) freq[nums1[i]]++;
        set.add(nums1[i]);
      }
      set.clear();
      for(int i=0;i<nums2.length;i++) {
        if(!set.contains(nums2[i])) freq[nums2[i]]++;
        set.add(nums2[i]);
      }
      set.clear();
      for(int i=0;i<nums3.length;i++) {
        if(!set.contains(nums3[i])) freq[nums3[i]]++;
        set.add(nums3[i]);
      }
      List<Integer> ans= new ArrayList<>();
      for(int i=0;i<freq.length;i++){
        if(freq[i]>=2) ans.add(i);
      }
      return ans;
    }
}