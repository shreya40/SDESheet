```
class Solution {
    boolean ans;
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;
        
      return  helper(root.left,root.right);
      
    }
    boolean helper(TreeNode l,TreeNode r)
    {
        if(l==null&&r==null)
        return true;
         if (l == null || r == null) {
            return false;
        }
        if(r.val!=l.val)
        return false;
        return helper(l.left,r.right)&&helper(l.right,r.left);
    }
}
```
