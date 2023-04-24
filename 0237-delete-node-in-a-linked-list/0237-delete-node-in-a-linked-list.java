/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode temp = node;
        
       // swap the value of linked list current to next value
        
        while(temp.next !=null){
            temp.val = temp.next.val;
            temp =temp.next;
            
        }
                  
         ListNode last = node;
        // going to the 2 nd last List Node
        while(last.next.next != null){
            last = last.next;
        }
        
        // remove the last node 
        last.next = last.next.next;
        
    }
}