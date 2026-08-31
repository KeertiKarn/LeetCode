class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result= new int[2];
        if(head.next.next==null)return new int[]{-1,-1};
        int prev=head.val;
        int curr=head.next.val;
        int next= head.next.next.val;
        ListNode temp= head.next;
        int count=1;
        List<Integer> list= new ArrayList<>();
        while(temp.next!=null){
            if(curr>prev && curr>next) list.add(count);
            else if(curr<prev && curr<next) list.add(count);
            count++;
            temp=temp.next;
            prev=curr;
            curr=next;
            if(temp.next!=null) next=temp.next.val;
        }
        if(list.size()<2) return new int[]{-1,-1};
        int max= list.get(list.size()-1)-list.get(0);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            min=Math.min(min,list.get(i+1)-list.get(i));
        }
        result[0]=min;
        result[1]=max;
        return result;
    }
}