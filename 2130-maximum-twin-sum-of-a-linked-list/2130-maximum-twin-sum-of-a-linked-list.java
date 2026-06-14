class Solution {
    public int pairSum(ListNode head) {
     ListNode slow= head;
       ListNode fast= head;
       while(fast!=null && fast.next!=null ){
           slow= slow.next;
           fast=fast.next.next;
       }
       ListNode j= reverseList(slow);
       ListNode i= head;
       int sum= Integer.MIN_VALUE;
       while(j!=null){
        int a=i.val+j.val;
        if(a>sum) sum=a;
        i=i.next;
        j=j.next;
       }
       return sum;
    }
     public ListNode reverseList(ListNode head) {
        if(head==null|| head.next==null) return head;
        ListNode prev= null;
        ListNode current = head;
        
       while(current!=null){
        ListNode next= current.next;
            current.next=prev;
            prev=current;
            current=next;
             }
           return prev;


    }
}