```
class Solution {
     int sumfinal=0;
     
    public int sumNumbers(TreeNode root) {
       
         helper(root,0);
         return sumfinal;
    }
    void helper(TreeNode root,int num)
    {
          
        if(root.left==null&&root.right==null)
        {
            num=num*10+root.val; 
             sumfinal+=num;
            
             return;
           
        }
      num=num*10+root.val;
       if(root.left!=null)  helper(root.left,num);
        if(root.right!=null)   helper(root.right,num);
        
    }
   
}
```
