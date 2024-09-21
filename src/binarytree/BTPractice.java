package binarytree;

public class BTPractice {



    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(2);
        bt.insert(1);
        bt.insert(3);
//        System.out.println("inOrder");
//        bt.inOrder(bt.root);
        System.out.println(bt.findKthSmallestElement(bt.root,2));
    }
}
