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
public class LinkedList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList LL= new LinkedList();
        LL.addNode(10);
        LL.addNode(6);
        LL.deleteAt(1);
       
        LL.insertAt(34,1);
        LL.addNode(9);
        System.out.println(LL);
        LL.showList();
    }
    
}
