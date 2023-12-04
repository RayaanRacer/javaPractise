/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "X";
        }
        String left = serialize(root.left);
        String right = serialize(root.right);
        return root.val +","+ left + "," + right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr= data.split(",");
        Queue<String> q = new LinkedList<>();
        for(int i=0;i<arr.length; i++){
            q.add(arr[i]);
        }
        return deserialize(q);
    }

    public TreeNode deserialize(Queue<String> q){
        if(q.size() == 0){
            return null;
        }
        String peek = q.remove();
        if(peek.equals("X")){
            return null;
        }
        TreeNode newNode = new TreeNode(Integer.parseInt(peek));
        newNode.left = deserialize(q);
        newNode.right = deserialize(q);
        return newNode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
