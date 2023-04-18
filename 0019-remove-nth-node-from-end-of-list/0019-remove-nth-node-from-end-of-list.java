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
        
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        if(size == 1 && n==1){
            return head=null;
        }
        
        size = size -n;
        if(size == 0){
            return head.next;
        }
        temp = head;
        int i =1;
        while (i< size){
            temp = temp.next;
            i++;
        }
        System.out.print(temp.val);
        
        temp.next = temp.next.next;
        
        return head;
    }
}