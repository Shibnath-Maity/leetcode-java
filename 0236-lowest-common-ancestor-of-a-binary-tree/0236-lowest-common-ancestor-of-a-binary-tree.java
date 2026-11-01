
class Solution {
       TreeNode res=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        res=null;
        find(root,p,q);
        return res;
    }

    int  find(TreeNode root, TreeNode p, TreeNode q) {
     
        if(root == null){
            return 0;
        }
        int left=find(root.left,p,q);
        int right=find(root.right,p,q);
        int self=0;
        if(root==p || root==q){
            self=1;
        }
        int total=left+right+self;
        if(total==2 &&res==null){
        res=root;
        }
        return total;
        
    }
}