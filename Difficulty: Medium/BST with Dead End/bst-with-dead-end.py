class Solution:
    def helper(self, root, mini, maxi):
        if not root:
            return False
            
        if not root.left and not root.right and (root.data - mini == 1 and maxi - root.data == 1):
            return True
        
        res = False
        if root.right:
            res = res or self.helper(root.right, root.data, maxi)
        
        if root.left:
            res = res or self.helper(root.left, mini, root.data)
            
        return res
    
    def isDeadEnd(self, root):
        return self.helper(root, 0, sys.maxsize)