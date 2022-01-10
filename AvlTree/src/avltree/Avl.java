/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avltree;

/**
 *
 * @author Hammad Ali
 */
public class Avl {
    int height( Node N){
        if (N== null)return 0;
        else
            return N.height;
    }
    int getBalanceFactor(Node n){
        if(n== null) return 0;
        else
            return height(n.left)-height(n.right);
            
    }
    int max (int a,int b){
        if (a>b){
            return a;
        }
        else
            return b;
    }
    Node leftRotate(Node a){
        Node b=a.right;
        Node c=a.left;
        
        b.left=a;
        a.right=c;
        a.height=max(height(a.left),height(a.right)+1);
        b.height=max(height(b.left),height(b.right)+1);
        return b;
    }
    
    Node rightRotate(Node b){
        
        Node a=b.left;
        Node c=b.right;
        a.right=b;
        b.left=c;
        a.height=max(height(a.left),height(a.right)+1);
        b.height=max(height(b.left),height(b.right)+1);
        return a; 
        
        
    }
    
    Node insertNode(Node node,int val){
        if (node== null)
            return new Node(val);
        if (val<node.data){
            node.left=insertNode(node.left,val);
            
        }
        else if (val> node.data){
            node.right=insertNode(node.right,val);
        }
        else
            return node;
        
        
        node.height=max(height(node.left),height(node.right)+1);
        int balanceFactor= getBalanceFactor(node);
        if (balanceFactor>1){
            //RR
            if(val<node.left.data){
                return rightRotate(node);
            }
            //RL
            else if (val>node.left.data){
                
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balanceFactor<-1){
            //LL
            if (val>node.right.data){
                return leftRotate(node);
            }
            //LR Rotation
            else if (val<node.right.data){
                node.right=rightRotate(node.right);
                return leftRotate(node);
                
            }
        }
        
      return node;      
    }
    
}
