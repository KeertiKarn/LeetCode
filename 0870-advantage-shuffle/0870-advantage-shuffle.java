class Pair{
    int data;
    int idx;
    Pair(int data,int idx){
        this.data=data;
        this.idx=idx;
    }
}

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Pair[] temp2= new Pair[nums1.length];
        for(int i=0;i<nums2.length;i++){
            temp2[i]= new Pair(nums2[i],i);
        }
        Arrays.sort(temp2,(a,b)->a.data-b.data);
        int[] ans = new int[nums1.length];
        Arrays.fill(ans,-1);
        Queue<Integer> que= new LinkedList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>temp2[j].data){
                ans[temp2[j].idx]=nums1[i];
                i++;
                j++;
            }
            else{
                que.add(nums1[i]);
                i++;
            }
        }
        for(int k=0;k<ans.length;k++){
            if(ans[k]==-1 && !que.isEmpty()){
                ans[k]=que.remove();
            }
        }
        return ans;
    }
}