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
    public ListNode reverseList(ListNode head) {
        ListNode temp,prev,New;
        temp=head;
        prev=null;
        while(temp!=null)
        {   New=temp.next;
            temp.next=prev;
            prev=temp;
            temp=New;
        }
        return prev;
    }
}