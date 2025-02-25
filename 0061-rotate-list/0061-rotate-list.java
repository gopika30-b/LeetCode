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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int n =0;
        ListNode lst = head;
        while(lst!=null){
            n++;
            lst = lst.next;
        }
        k%=n;
        for(int i=0; i<k; i++){
            ListNode curr = head;
            while(curr.next.next!=null) curr = curr.next;
            curr.next.next = head;
            head = curr.next;
            curr.next = null;
        }
        return head;
    }
}