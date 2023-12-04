import java.util.*;
class BinaryTreeM{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        static Node treeBuilder(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = treeBuilder(nodes);
            newNode.right = treeBuilder(nodes);
            return newNode;
        }
        static void preOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }
        static void inOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }

        static void postOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data+" ");
        }
        static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        System.out.println();
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
        static int height(Node root){
            if(root == null){
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return left + right +1;
        }
        static int weight(Node root){
            if(root == null){
                return 0;
            }
            int left = weight(root.left);
            int right = weight(root.right);
            return left + right + root.data;
        }
        static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int dia1 = height(root.left) + height(root.right) + 1;
            int dia2 = diameter(root.left);
            int dia3 = diameter(root.right);
            return Math.max(dia1, Math.max(dia2, dia3));
        }
        static boolean isBST(Node root){
            return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        static boolean isBST(Node root, Integer longVal, Integer shortVal){
            if(root == null) return true;
            if(root.data >= longVal || root.data < shortVal) return false;
            return isBST(root.left,root.data, shortVal) && isBST(root.right, longVal, root.data);        }
    }
    public static void main(String[] args){
        int[] nodes = {5, 3, 1, -1, -1, 4, -1, -1, 8, -1, 9, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node n = tree.treeBuilder(nodes);
        // tree.preOrder(n);
        // System.out.println();
        // tree.inOrder(n);
        // System.out.println();
        // tree.postOrder(n);
        // System.out.println();
        // tree.levelOrder(n);
        // System.out.println();
        System.out.print(tree.isBST(n));


    }
}
