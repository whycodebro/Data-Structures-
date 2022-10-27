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
        
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        System.out.println(count);
        
        temp  = head;
        int i=0;
        for(i=0;i<count;i++){
            st.push(temp.val);
            temp = temp.next;
        }
        temp=head;
       while(temp.next != null &&  !st.isEmpty()){
           if(st.pop() != temp.val){
               return false;
           }
           temp = temp.next;
       }
        
        
        
        return true;
        
    }
}
