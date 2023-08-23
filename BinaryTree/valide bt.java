```
class Solution {
    public boolean isValidBST(TreeNode root) {
        return help(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
      boolean help(TreeNode root,long min,long max)
      {
        if(root==null)
        return true;
        if(root.val<=min||root.val>=max)
        return false;
        return help(root.left,min,root.val)&& help(root.right,root.val,max);
      }
        
    }
```
