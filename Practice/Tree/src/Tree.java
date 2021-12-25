public class Tree {
    private static class Node {
        private final int value;
        private Node leftchild;
        private Node rightchild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int item) {
        var newNode = new Node(item);

        if (root == null) {
            root = newNode;
            return;
        }

        var current = root;
        while (true) {
            if (item < current.value) {
                if (current.leftchild == null) {
                    current.leftchild = newNode;
                    break;
                }
                current = current.leftchild;
            } else {
                if (current.rightchild == null) {
                    current.rightchild = newNode;
                    break;
                }
                current = current.rightchild;
            }
        }
    }

    public boolean find(int item) {
        var current = root;
        while (current != null) {
            if (item < current.value) {
                current = current.leftchild;
            } else if (item > current.value) {
                current = current.rightchild;
            } else if (item == current.value) {
                return true;
            }

        }
        return false;
    }

    //  preorder
    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
//        base cond
        System.out.println(root.value);
        if (root.leftchild == null & root.rightchild == null) {
            return;
        }
        preOrderTraversal(root.leftchild);
        preOrderTraversal(root.rightchild);
    }

    //    inorder
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.leftchild);
        System.out.println(root.value);
        inOrderTraversal(root.rightchild);
    }

    //    post orders
    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.leftchild);
        postOrderTraversal(root.rightchild);
        System.out.println(root.value);

    }

    //    height
    public int height() {
        if (root == null) return -1;
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;
        if (root.leftchild == null && root.rightchild == null) return 0;
        return 1 + Math.max(height(root.leftchild), height(root.rightchild));
    }

    public boolean equals(Tree other) {
        if (other == null) {
            return false;
        }
        return equals(root, other.root);
    }

    public boolean equals(Node first, Node second) {
//  if null
        if (first == null && second == null) {
            return false;
        } else if (first != null && second != null) {
//            check for the value and the left and right sub tree respectibly
            return first.value == second.value &&
                    equals(first.leftchild, second.leftchild) &&
                    equals(first.rightchild, second.rightchild);

        }
        return false;
    }

    //    check valid bst
    public boolean isValidBST() {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(Node bst, int min, int max) {
        var current = bst;
        if (current == null) {
            return true;
        }
//        check root
        if (min < root.value < max){

        }
//        return
//        rre leftchild
//        ree rightchild

            return false;
    }
}


