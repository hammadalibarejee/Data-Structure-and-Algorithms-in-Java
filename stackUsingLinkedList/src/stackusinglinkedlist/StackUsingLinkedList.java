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
public class StackUsingLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack sl= new Stack();
        sl.push(8);
        sl.push(10);
        sl.push(19);
        sl.push(6);
        sl.push(7);
        sl.push(8);
        sl.push(3);
        sl.push(2);
        sl.pop();
        sl.showStack();
        
        
    }
    
}
