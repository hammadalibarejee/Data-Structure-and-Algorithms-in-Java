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
public class QueueUsingLinkedLink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        queue q= new queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(9);
        q.enqueue(10);
        q.dequeue();
        q.showQueue();
    }
    
}
