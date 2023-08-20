```
class Solution {
       int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        helper(root);
        return maxi;
      
    }
  int helper(TreeNode root)
    {
     if(root==null)
      return 0;
     int lh=helper(root.left);
      int rh=helper(root.right);
       maxi=Math.max(maxi,lh+rh);
       return 1+Math.max(lh,rh);
    }
}
```
