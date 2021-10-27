/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusinglinkedlink;

/**
 *
 * @author Hammad Ali
 */
public class queue {
    Node head;
    Node rear;
    public void enqueue(int data){
        Node node= new Node(data);
        if (head==null){
            head=rear=node;return;
        }
            rear.next=node;
            rear=node;
        
        
    }
    public int dequeue (){
        Node res = null;
    if (head==null){
        System.out.println("Stack Underflow");
    }
    else{
        res=head;
        head=head.next;
        return res.data;
    }
//    return res;
      return res.data;
}
    public void showQueue(){
        Node temp=head;
        while (temp!= null){
            System.out.print("Memory Location:  "  +temp + "   ");
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
