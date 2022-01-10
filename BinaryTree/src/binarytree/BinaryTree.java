/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;
import java.util.Scanner;

/**
 *
 * @author Hammad Ali
 */
public class BinaryTree {
    static Scanner sc=null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sc= new Scanner(System.in);
        Node root=createTree();
        System.out.println(root);
        System.out.println("IN ORDER");
        inOrder(root);
        System.out.println("PRE ORDER");
        
        preOrder(root);
        System.out.println("POST Order ");
        
        postOrder(root);
        
        
        
        
        
    }
    static Node createTree(){
         Node root = null;
        
        System.out.println("Enter data");
        int data=sc.nextInt();
        if (data==-1) return null;
        
        root= new Node (data);
        
        System.out.println("Enter Left for "+ data);
        root.left=createTree();
        
        
        System.out.println("Enter Right for " +data);
        root.right=createTree();
        
        
        
        return root;
    }
    static void inOrder(Node root){
        if (root==null) return;
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        
        inOrder(root.right);
    }
    
    static void preOrder(Node root){
        if (root == null )return ;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    static void postOrder( Node root ){
        if (root == null )return;
        postOrder(root.left);
        postOrder(root.right);
        
        System.out.print(root.data + " ");
    }
   
    
}
