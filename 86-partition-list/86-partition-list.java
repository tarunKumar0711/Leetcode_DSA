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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(0), d2 = new ListNode(0);
        ListNode curr1=d1,curr2=d2;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                curr1.next=head;
                curr1=head;
            }
            else
            {
                curr2.next=head;
                curr2=head;
            }
            head=head.next;
        }
        
        curr2.next=null;
        curr1.next=d2.next;
        return d1.next;
    }
}