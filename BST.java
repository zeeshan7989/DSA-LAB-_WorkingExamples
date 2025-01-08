/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sourceby;

/**
 *
 * @author 123
 */
class Node{
      int key;
      Node left , right;
      
      public Node(int item){
          key = item ;
          left = right = null ;
      }
  }

public class BST {

    
      Node root;
      BST(int key){
          root = new Node(key);
      }
  
      BST(){
          root = null;
      }
      void printPostorder(Node node){
          if (node == null) 
            return ;
          
          printPostorder(node.left);
          
          printPostorder(node.right);
         
          System.out.println(node.key + " ");  
          
      }
      
      void printInorder(Node node){
          if (node == null)
              return ;
          
          printInorder(node.left);
          System.out.println(node.key + " ");
          printInorder(node.right);
          
      }
      
     void printPreorder(Node node){
          if (node == null)
              return ;
          System.out.println(node.key + " ");
             
          printPreorder(node.left);
  
          printPreorder(node.right);
          
      }
  
  
    public static void main(String[] args) {
        BST tree = new BST();
        
        tree.root = new Node(8);
        
        Node a = new Node(3);
        tree.root.left = a;
        Node b = new Node(10);
        tree.root.left = b;
        
        a.left = new Node(1);
        a.right = new Node(6);
        
        b.left = new Node(9);
        b.right = new Node(14);
        
        System.out.println("Pre-Order");
        tree.printPreorder(tree.root);
        
        System.out.println("\nPost-Order");
        tree.printPostorder(tree.root);
        
        System.out.println("\nIn-Order");
        tree.printInorder(tree.root);
    }
}
