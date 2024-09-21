package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

     int size;
     Node root;
     Node leaf;

     public void insert(int val){
        root = insertRec(root,val);
     }

     //In tree recursive call will be play a major role in insert/ delete
     Node insertRec(Node root, int val){
         Node node;
          if(root ==null){
              node = new Node(val);
              root = node;
              size++;
              return root;
          }
          else if(val< root.val)
              root.left=insertRec(root.left,val);
          else if(val> root.val)
              root.right = insertRec(root.right,val);


          size++;

          return root;
     }


     public int findKthSmallestElement(Node A,int B){
         List<Integer> ans = new ArrayList<>();
         inOrderTraversal(A,ans);
         return ans.get(B-1);
     }

     public void inOrderTraversal(Node A , List<Integer> ans){
         if(A==null)
             return;

         inOrderTraversal(A.left,ans);
         ans.add(A.val);
         inOrderTraversal(A.right,ans);
     }

     void preOrder(Node root){
         if(root ==null)
              return;

         System.out.println(root.val);
         preOrder(root.left);
         preOrder(root.right);
     }

     void inOrder(Node root){
         if(root == null)
             return;

         inOrder(root.left);
         System.out.println(root.val);
         inOrder(root.right);
     }

     void postOrder(Node root){
         if(root == null)
             return;
         postOrder(root.left);
         postOrder(root.right);
         System.out.println(root.val);
     }




     class Node{
         int val;
         Node left;
         Node right;

         Node(int val){
             this.val = val;
             left = null;
             right = null;
         }

         Node(int val,Node left,Node right){
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

}
