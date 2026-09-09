class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<bulbs.size();i++){
            int ele= bulbs.get(i);
            if(set.contains(ele)) set.remove(ele);
            else set.add(ele);
        }
        List<Integer> ans= new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}