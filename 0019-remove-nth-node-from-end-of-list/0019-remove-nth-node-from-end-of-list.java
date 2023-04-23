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
               
        ListNode t =head ;
        int size =0;
        
        // find the size of the LinkedList 
        
        while(t != null){
            t =t.next;
            size++;
        }
        
        // if size of  linked list is 1 return empty node
        
        if(size == 1){
            return head.next;
        }   
        
        // remove first/Last Node of the LinkedList        
        if(size - n == 0){
            return head.next;
        }
    
        int index =1;
        ListNode temp=head;
        
        // going to the last n-1 node 
        while(index < size-n){
            temp = temp.next;
            index++;
        }
        
        // delete the n th Node of the linked list
        temp.next = temp.next.next;
                
        return head;
    }
}