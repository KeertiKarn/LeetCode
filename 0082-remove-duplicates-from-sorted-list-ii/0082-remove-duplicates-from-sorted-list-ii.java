class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        HashMap<Integer,Integer> map= new HashMap<>();
        ListNode temp= head;
        while(temp!=null){
            if(map.containsKey(temp.val)) map.put(temp.val,map.get(temp.val)+1);
            else map.put(temp.val,1);
            temp=temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp1=head;
        ListNode temp2=dummy;
        while(temp1!=null){
            if(map.get(temp1.val)==1){
                temp2.next=temp1;
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        temp2.next=null;
        return dummy.next;
        
    }
}