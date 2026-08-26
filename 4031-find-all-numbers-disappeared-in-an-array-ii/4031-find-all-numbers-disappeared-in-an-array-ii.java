class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
     HashSet<Integer> set= new HashSet<>();
     for(int ele: nums) set.add(ele);
     List<List<Integer>> result= new ArrayList<>();
     int i=lower;
     while(i<=upper){
        if(!set.contains(i)){
            int start=i;
            while(i<=upper && !set.contains(i)) i++;
            int end=i-1;
            List<Integer> temp= new ArrayList<>();
            temp.add(start);
            temp.add(end);
            result.add(temp);
        }
        else i++;
     }
     return result;   
    }
}