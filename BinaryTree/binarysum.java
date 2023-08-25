```
class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
       sum=0;
       helper(root, low, high);
       return sum;
    }
    void helper(TreeNode root,int low,int high)
    {
        if(root==null)
       return;
       if(root.val>= low && root.val <=high)
         sum=sum+root.val;
        if(root.val>low)   helper(root.left,low,high);
        if(root.val<high)  helper(root.right,low,high);
        
    }
}
```
