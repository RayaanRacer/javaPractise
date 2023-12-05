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
    static Queue<TreeNode> q = new LinkedList<>();
    static int j=0;
    static void traver(TreeNode root){
        if(root == null){
            return;
        }
        traver(root.left);
        q.add(root);
        j++;
        traver(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        traver(root);
        if(k>=j){
            return -1;
        }
        int i=-1;
        int[] arr = new int[j];
        while(!q.isEmpty()){
            i++;
            arr[i] = q.remove().val;
        }
        for(int m=0;m<k;m++){
            if(m==k-1){
                return arr[m];
            }
        }
        return -1;
    }
}
