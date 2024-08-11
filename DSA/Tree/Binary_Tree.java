package DSA.Tree;

    import java.util.*;
    
    class Node {
        int data;
        Node left, right;
        int height;
    
        public Node(int val) {
            data = val;
            left = right = null;
            height=0;
        }
    }
    
    class Binary_Tree {
        Node create(int data) {
            return new Node(data);
        }
    
        Node insert(Node root, int data) {
            if (root == null) {
                return create(data);
            }
            if (data < root.data) { 
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
            return root;
        }
    
        public void preorder(Node root) { 
            if (root != null) {
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }
        public void inorder(Node root) { 
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }
        public void postorder(Node root) { 
            if (root != null) {
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data + " ");
            }
        }
        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                System.out.print(current.data + " ");
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    
        public int height(Node root) {
            if (root == null) {            
                return -1;
            }
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    
        public Node search(Node root, int key) {
            if (root == null || root.data == key) {
                return root;
            }
            if (key < root.data) {
                return search(root.left, key);
            }
            return search(root.right, key);
        }
    
        public static void main(String[] args) {
            Binary_Tree T1 = new Binary_Tree();
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            Node root = T1.create(k);
            
            while (true) {
                int val =sc.nextInt();
                if (val<0) {
                    break;
                }
                T1.insert(root, val);
            }
            
            System.out.println("PREORDER:");
            T1.preorder(root);
            System.out.println("\nINORDER:");
            T1.inorder(root);
            System.out.println("\nPOSTORDER:");
            T1.postorder(root);
            System.out.println("\nLEVEL ORDER:");
            T1.levelOrder(root);
            System.out.println("\nHEIGHT = " + T1.height(root));
            
            int l = sc.nextInt();
            Node result = T1.search(root, l);
            
            if (result != null) {
                System.out.println("Element Found");
            } else {
                System.out.println("Element Not Found");
            }
        }
    }