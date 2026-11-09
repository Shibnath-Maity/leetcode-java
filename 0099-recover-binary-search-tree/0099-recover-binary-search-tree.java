/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev=null;
    TreeNode g1first=null;
    TreeNode g1second=null;
    TreeNode g2first=null;
    TreeNode g2second=null;
    int w=0;
    public void recoverTree(TreeNode root) {
        recoverTree1( root);
        if(w==1){
            swap(g1first,g1second);
        }else{
            swap(g1first,g2second);
        }


    }

        void recoverTree1(TreeNode root){

        if(root==null){
            return;
        }
        recoverTree1(root.left);
        if(prev==null){
         prev=root;
        }else{
            if(root.val<=prev.val){
                if(w==0){
                g1first=prev;
                g1second=root;
                w++;
                }else{
                    g2first=prev;
                    g2second=root;
                    w++;
                }
            }
             prev=root;
        }
               
                recoverTree1(root.right);  

            
        }

        void swap(TreeNode a,TreeNode b){
            int temp=a.val;
            a.val=b.val;
            b.val=temp;
        }
        
        
    }
