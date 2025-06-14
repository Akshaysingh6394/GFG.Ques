/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    public boolean isSymmetric(Node root) {
        // Code here
          return fun(root, root);
    }
    public boolean fun(Node l , Node r){
        if( l == null && r == null) return true;
        if(l == null || r == null) return false;
        
        
        boolean ans =  fun(l.left,r.right) && fun(l.right,r.left);
       if(l.left != null &&  r.right != null) 
       ans = ans && (l.left.data == r.right.data); 
       if(r.left != null && l.right != null)
       ans = ans && (l.right.data ==
        r.left.data);
        
        return ans;
    }
}