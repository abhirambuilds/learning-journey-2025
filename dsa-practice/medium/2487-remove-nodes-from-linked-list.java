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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        temp=reverse(temp);
        ListNode rev=temp;
        int Max=temp.val;
        while(temp.next!=null)
        {   if(temp.next.val < Max)
            {   temp.next=temp.next.next;
            }
            else
            {   Max=temp.next.val;
                temp=temp.next;
            }
        }
        rev=reverse(rev);
        return rev;
    }
    private ListNode reverse(ListNode head)
    {   ListNode temp,prev,New;
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