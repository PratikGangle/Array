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
        
        // if List size is one
        if(head.next == null){
            if(n==1){
                ListNode ans = null;
                return ans;
            }
            else{
                return head;
            }
        }
        
        
        // create a arrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        // add element in arrayList
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int size = list.size();
        
        // remove i th last node in the arrayList
        list.remove(size-n);
        
         
         ListNode ans = new ListNode(list.get(0));
        ListNode a = ans;
        
        // add element arrayList to LinkedList
        for(int i=1; i<size-1; i++){
            ListNode t = new ListNode(list.get(i));  
            a.next = t;
            a = a.next;                        
        }
        
        // return the ListNode head Node        
        return ans;
    }
}