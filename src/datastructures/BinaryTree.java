package datastructures;

public class BinaryTree {

    Node root;
    
    BinaryTree() {
        root = null;
    }
    
    BinaryTree(int data) {
        root = new Node(data);
    }
    
    
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(1);
        
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        
        binaryTree.root.left.left = new Node(4);
        
        binaryTree.root.insert(10);
        
        binaryTree.root.insert(7);
        
        binaryTree.root.printInOrder();
        
        System.out.println(binaryTree.root.checkBST(binaryTree.root));
    }
    
    
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            left = right = null;
        }
        
        public void insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }
        
        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            
            System.out.print(data + " ");
            
            if (right != null) {
                right.printInOrder();
            }
        }
        
        public boolean checkBST(Node root) {
            return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        boolean checkBST(Node root, int minValue, int maxValue) {
            if (root == null) {
                return true;
            }else if (root.data < minValue || root.data > maxValue) {
                return false;
            } else {
                return (checkBST(root.left, minValue, root.left.data - 1) && 
                       checkBST(root.right, root.right.data + 1, maxValue));
            }
        }
        
//        public void delete(int value) {
//            if (data == value) {
//                
//            }
//        }
        
        
        
        
        
        
    }
    
}
