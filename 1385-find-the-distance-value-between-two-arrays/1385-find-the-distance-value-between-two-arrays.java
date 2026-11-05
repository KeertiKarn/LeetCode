class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans=0;
        for(int ele: arr1){
            int high=arr2.length-1;
            int low=0;
            boolean found=false;
            while(low<=high){
                int mid= low+(high-low)/2;
                if (arr2[mid] >= ele - d && arr2[mid] <= ele + d) {
                    found = true; // Element found too close
                    break;
                } else if (arr2[mid] < ele - d) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (!found) {
                ans++;
            }
        }
         return ans;
    }
}