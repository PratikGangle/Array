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
        
        int size =0;        
        ListNode temp = head;
        
        // find the size of the linkedlist
        while(temp !=null){
            temp = temp.next;
            size++;
        }      
        
        int half = size/2;    
        
        Stack<Integer> stack = new Stack<>();
        
        int i=1;           
        // push half element in the stack;
        temp = head;
        while(i<=half)
        {
            stack.push(temp.val);
            temp = temp.next;
            i++;
        }
        // if linkedlist size is odd skip one element
        if(size % 2 != 0){
            temp = temp.next;            
        }
          
        //check linkedlist is palindrome or not
        while(temp != null){
            int val  = temp.val;            
            if(stack.pop() != val){
                return false;
            }
            temp = temp.next;
        }
        
        return true;
    }
}