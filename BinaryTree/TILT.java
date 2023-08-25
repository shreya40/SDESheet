```
class Solution {
    int sum=0;
    public int findTilt(TreeNode root) {
       task(root);
       return sum;
        
    }
    int task(TreeNode root)
    {
        if(root==null)
        return 0;
       
        int ls=task(root.left);
          int rs=task(root.right);
          sum=sum+Math.abs(ls-rs);
          return root.val+ls+rs;
    }
}
```
