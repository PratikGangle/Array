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
        
        if(head == null){
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        
        Collections.sort(list);
        
        System.out.print(list);
        
         ListNode ans = new ListNode(list.get(0));       
        
        ListNode tempNode = ans;
        
        for(int i =1; i<list.size(); i++){
            
            int val = list.get(i);
            ListNode node = new ListNode(val);
            tempNode.next = node;
            tempNode = tempNode.next;
        }
        
        return ans;
    }
}