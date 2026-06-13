class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n=skills.length;
        if(k>=n){
            int max= Integer.MIN_VALUE;
            int idx=-1;
            for(int i=0;i<skills.length;i++){ 
               if(skills[i]>max){
                max=skills[i];
                idx=i;
               }
           }
            return idx;
        }
        Queue<Integer> queue= new LinkedList<>();
        for(int i=0;i<n;i++) queue.add(i);
        int count=0;
        int ele= queue.remove();
        while(count<k){   
            int opponent =queue.remove();
            if(skills[ele]>skills[opponent]){
                queue.add(opponent);
                count++;
            }
            else{
            queue.add(ele);
            count=1;
            ele=opponent;
            }      
        }
        return ele;
    }
}