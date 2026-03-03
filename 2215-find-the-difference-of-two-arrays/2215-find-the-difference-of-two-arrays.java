class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for(int i=0;i<nums1.length;i++) set1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++) set2.add(nums2[i]);
        for(int i=0;i<nums1.length;i++){
            if(set2.contains(nums1[i])){
                set1.remove(nums1[i]);
                set2.remove(nums1[i]);
            }
        }
         List<Integer> temp1= new ArrayList<>(set1);
         List<Integer> temp2= new ArrayList<>(set2);
         List<List<Integer>> ans= new ArrayList<>();
          ans.add(temp1);
        ans.add(temp2);
        return ans;
        
    }
}