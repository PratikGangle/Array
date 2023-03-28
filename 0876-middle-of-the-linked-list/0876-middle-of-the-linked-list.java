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
    public ListNode middleNode(ListNode head) {
        
        if(head.next == null){
            return head;
        }
        
        int size =0;
        ListNode temp = head;
        ListNode middle =head;
        
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        
        if(size %2 == 0){
             size = size/2 ;
        }
        else{
            size = size/2 +1;
        }
       
        int i=0;
        while(i<size){
            middle = middle.next;
            i++;
        }
        
        return middle;
    }
}