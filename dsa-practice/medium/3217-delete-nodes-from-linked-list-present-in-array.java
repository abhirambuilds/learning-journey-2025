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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null) return null;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        ListNode temp=head;
        ListNode dummy= new ListNode(0,temp);
        ListNode prev=dummy;
        while(temp!=null)
        {   if(set.contains(temp.val))
            {   prev.next=temp.next;
                temp=temp.next;
            }
            else
            {   prev=temp;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}