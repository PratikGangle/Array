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
    public ListNode deleteMiddle(ListNode head) {     
        if(head.next == null){
            return null;
        }
        ListNode s = null;
        ListNode f = head;
        
        while(f != null && f.next != null){
            if(s == null) 
                s = head;
            else{
                s = s.next;
            }
            f = f.next.next;
        }
        s.next = s.next.next;
        return head;
    }
}