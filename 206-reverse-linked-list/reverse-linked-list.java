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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode temp,lost;
        temp = head.next;
        lost =temp.next;
        temp.next = head;
        head.next=null;
        while(lost!=null){
            head = temp;
            temp = lost;
            lost = lost.next;
            temp.next = head;
        }
        head = temp;
        return head;
    }
}