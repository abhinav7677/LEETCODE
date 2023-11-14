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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        ListNode newn =new ListNode(head.val); // new single node that stores the value of head 
        ListNode res=newn; // reference to the new list which will be created from newn
        ListNode curr=head;
        while(curr!=null)
        {
            if(newn.val!=curr.val) //checking if the curr.data is not equal to newn.data in that case we will be adding the data of current node to newn and then newn will point to the current newn node.
            {
                newn.next=new ListNode(curr.val);
                newn=newn.next;
            }
            curr=curr.next; // incrementing the curr pointer
        }
        return res; //returing the original newn list
    }
}