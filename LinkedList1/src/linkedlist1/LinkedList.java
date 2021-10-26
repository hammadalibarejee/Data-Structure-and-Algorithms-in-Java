/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist1;

/**
 *
 * @author Hammad Ali
 */
public class LinkedList {
    Node head;
    Node nxt1;
    public void addNode(int data){
        if (this.head==null){
            this.head =new Node (data);
        }
        else{
            Node node=new Node(data);
            nxt1=head;
            while (nxt1.next!=null){
                nxt1=nxt1.next;
            }
            nxt1.next=node;
        }
    }
    public void showList(){
        nxt1=head;
        while (nxt1 !=null){
            System.out.print( "Memory Location "+ nxt1 +" :");
            System.out.print(nxt1.data +" ->");
            
            nxt1=nxt1.next;
        }
    }
    public void insertAt(int data, int pos){
        Node node= new Node(data);
        if (pos==0){
            node.next=head;
            head=node;
        }
        else{
            nxt1=head;
            for (int i=0;i<pos-1;i++){
                nxt1=nxt1.next;
                
            }
            node.next=nxt1.next;
            nxt1.next=node;
            
        }
    }
    public void deleteAt(int pos){
        if (pos==0){
            head=head.next;
            return;
        }
        else{
            nxt1=head;
            for (int i=0;i<pos-1;i++){
                nxt1=nxt1.next;
            
        }
            nxt1.next=nxt1.next.next;
        }
    }
    
    
}
