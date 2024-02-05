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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        ListNode temp = head;
        while(head!=null && head.val == val){
            temp = head;
            head = head.next;
            temp.next = null;
        }
        temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val == val){
                ListNode del = temp.next;
                temp.next = temp.next.next;
                del.next = null;
            }
            else{
                temp = temp.next;
            }
        }

        return head;
    }
}