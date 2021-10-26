/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusinglinkedlist;

/**
 *
 * @author Hammad Ali
 */
public class Stack {
    Node head;
    int size;
    public Stack(){
        head=null;
        size=0;
    }
    void push (int data){
        Node node= new Node(data);
        node.next=head;
        head=node;
    }
    int peek(){
        if (head==null){
            System.out.println("Stack Underflow");
        }
        return head.data;
    }
    int pop(){
        int res = 0;
        if (head==null){
            System.out.println("Stack Underflow");
        }
        else{
            res=head.data;
            head=head.next;
            size--;
            return res;
            
        }
        return res;
    
       
    
}
    boolean isEmpty(){
        return head==null;
    }
    int size(){
        return size;
    }
    public void showStack(){
        Node nxt1=head;
        while(nxt1!= null){
            System.out.print("Memory Location: "+nxt1 + " ");
            System.out.println(nxt1.data);
            nxt1=nxt1.next;
        }
        
    }
}
