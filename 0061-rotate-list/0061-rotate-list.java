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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int size = 0;
        
        ListNode temp = head;
        
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        int rotate = k % size ;
        if(rotate == 0){
            return head;
        }
        
        int i = 1;
        int j = size - rotate ;
        temp = head;
        while(i<j){
            temp = temp.next;    
            i++;
        }
        
        ListNode node = temp.next;
        ListNode ans = node;
        
     
        temp.next = null;
        
        while(node.next != null){
            node = node.next;
        }
        node.next = head;        
        return ans;
    }
}