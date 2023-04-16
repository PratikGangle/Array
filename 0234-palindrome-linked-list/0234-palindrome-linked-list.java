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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        // find the middle of the linkedlist 
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reverse the half side of the linkedlist
        
        slow.next = reverseList(slow.next);
        
        //move slow two right half
        slow = slow.next;
        
        //check the left half and right half is equal or not
        while(slow !=null){
            if(head.val != slow.val){
                return false;
            }
            head=head.next;
            slow= slow.next;
        }
        
        return true;
    }
    
    
    public ListNode reverseList(ListNode head){
        ListNode pre =null;
        ListNode next =null;
        
        while(head!=null){
            next = head.next;
            head.next =pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}