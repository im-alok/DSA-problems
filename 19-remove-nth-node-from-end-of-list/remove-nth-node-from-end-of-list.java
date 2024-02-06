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
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        int itr = count - n;
        if(itr == 0){
            temp = head;
            head = head.next;
            temp = null;
        }
        else{
            temp = head;
            while(itr > 1){
                temp = temp.next;
                itr--;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}