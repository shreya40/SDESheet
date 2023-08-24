```
class Solution {
   
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return construct(0,nums.length-1,nums);

    }
    
    TreeNode construct(int low,int high,int[] arr)
    {
        if(low>high)
        return null;
        int root=0;
        int rootinx=0;
        for(int i=low;i<=high;i++)
        {
            if(arr[i]>=root)
            {
                root=arr[i];
                rootinx=i;
            }
        }
        TreeNode head=new TreeNode(root);
        head.left=construct(low,rootinx-1,arr);
        head.right=construct(rootinx+1,high,arr);
        return head;
    }
}
```
