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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        
        int size =0;
        //find the size of the linkedlist
        while(temp != null){
            temp = temp.next;
            size++;
        }
        // if linked list size is one so return the empty linked list
        if(size == 1 && n==1){
            return head=null;
        }
        
        size = size -n;
        // remove first node of the linkedlist
        if(size == 0){
            return head.next;
        }
        temp = head;
        int i =1;
        
        // going to the i th node of the linked list
        while (i< size){
            temp = temp.next;
            i++;
        }
       
        // remove the i th node 
        temp.next = temp.next.next;
        
        return head;
    }
}