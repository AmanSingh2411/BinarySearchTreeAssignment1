package main;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(60);
        tree.insert(35);
        tree.insert(59);
        tree.insert(32);
        tree.inOrder(tree.getRoot());
        tree.insert(20);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(69));
        System.out.println(tree.search(42));
    }
}
