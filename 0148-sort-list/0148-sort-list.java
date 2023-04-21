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
    public ListNode sortList(ListNode head) {
        
        // if ListNode is empty return empty node
        if(head == null){
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        // store ListNode value in the ArrayList
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        
        // Sort the ArrayList
        Collections.sort(list);
      
        ListNode ans = new ListNode(list.get(0));       
        
        ListNode tempNode = ans;
        
        // create a new listNode in which element is stored order
        for(int i =1; i<list.size(); i++){            
            int val = list.get(i);
            ListNode node = new ListNode(val);
            tempNode.next = node;
            tempNode = tempNode.next;
        }
        // return the head of the answer Node
        return ans;
    }
}