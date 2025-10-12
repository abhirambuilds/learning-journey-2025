/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
      if(head==null) return null;
      ListNode dummy,prev,curr=head;
      dummy=new ListNode(0,head);
      prev=dummy;
      int key=val;
      while(curr!=null)
      {     if(curr.val==key)
            {   prev.next=curr.next;
                curr=curr.next;
            }
            else
            {   prev=curr;
                curr=curr.next;
            }
      }  
      return dummy.next;
    }
}