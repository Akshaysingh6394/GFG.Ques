//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends



class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        if(head.next == null ) return head;
        
        Node ascL = new Node(-1);
        Node ascLItr = new Node(-1);
        ascLItr = ascL;
        Node dscL = new Node(-1);
        
        int idx = 0;
        
        Node itr = new Node(0);
        itr = head;
        
        while(itr!=null){
            Node newNode = new Node(itr.data);
            if(idx%2==0){
                ascLItr.next = newNode;
                ascLItr = ascLItr.next;
            } else {
                newNode.next = dscL;
                dscL = newNode;
            }
            idx++;
            itr = itr.next;
        }
        ascL = ascL.next;
        ascLItr = ascL;
        boolean done = false;
        while(ascLItr!=null){
            if(ascLItr.next==null && done==false){
                ascLItr.next = dscL;
                done = true;
            }
            if(ascLItr.next.data==-1){
                ascLItr.next = null;
            }
            ascLItr = ascLItr.next;
        }
        return ascL;
   }
}