package binarytree;

public class DistanceBetweenNodes {

    public static void insertBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.insert(50);
//        binaryTree.insert(15);
//        binaryTree.insert(7);
//        binaryTree.insert(12);
//        binaryTree.insert(8);
//        binaryTree.insert(14);
//        binaryTree.insert(25);
//        binaryTree.insert(29);
//        binaryTree.insert(27);
//        binaryTree.insert(65);
//        binaryTree.insert(55);
//        binaryTree.insert(52);
//        binaryTree.insert(63);
//        binaryTree.insert(80);
//        binaryTree.insert(75);
        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(4);
        binaryTree.insert(8);
        binaryTree.insert(6);
        binaryTree.insert(11);
        System.out.println(solveDistanceBtwNodes(binaryTree.root, 2,6));
    }

    public static int solveDistanceBtwNodes(BinaryTree.Node tree, int B, int C){
        BinaryTree.Node L = tree;
        BinaryTree.Node R = tree;
        BinaryTree.Node curr = tree;
        int d1 =0;
        int d2 =0;
        while(L.val!=B || R.val!=C){
            if(curr.val <B && curr.val< C) {
                curr=curr.right;
                R = curr;
                L = curr;
            }
            else if(curr.val>B && curr.val>C){
                curr=curr.left;
                L=curr;
                R=curr;
            }
            else{
                if(B<L.val)      {  L=L.left;    d1++;    }
                else if(B>L.val) {  L=L.right;   d1++;    }

                if(C<R.val)      {  R=R.left;    d2++;    }
                else if(C>R.val) {  R=R.right;   d2++;    }
            }
        }
        return d1+d2;
    }

    public static void main(String[] args) {
        insertBinaryTree();
    }
}
