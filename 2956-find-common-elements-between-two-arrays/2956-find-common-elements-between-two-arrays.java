class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        for(int i=0;i<nums1.length;i++) set1.add(nums1[i]);
        int answer2=0;
        for(int ele:nums2){
            if(set1.contains(ele)) answer2++;
        }
         HashSet<Integer> set2= new HashSet<>();
        for(int i=0;i<nums2.length;i++) set2.add(nums2[i]);
        int answer1=0;
        for(int ele:nums1){
            if(set2.contains(ele)) answer1++;
        }
        return new int[]{answer1,answer2};
    }
}