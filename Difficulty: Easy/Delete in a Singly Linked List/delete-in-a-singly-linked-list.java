/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if (x == 1) {
            return head.next;
        }
        Node temp = head;
        // while(temp != null){
        //     temp= temp.next;
        //     size++;
        // }
        int i = 2;
        while(i<x && temp != null){
            temp = temp.next;
            i++;
        }
         if (temp == null || temp.next == null) {
            return head; // position x doesn't exist
        }
        temp.next = temp.next.next;
        return head;
        
    }
}