package trees;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;

    BinaryTreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
    BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void printPreOrder(BinaryTreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printInOrder(BinaryTreeNode node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public void printPostOrder(BinaryTreeNode node) {
        if (node == null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }
}
