/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Hammad Ali
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack s=new MyStack(10);
//        s.pop();
//        s.push(5);
//        s.push(13);
//        s.push(8);
//        s.push(18);
//        s.push(10);
//        s.push(1);
//        s.push(3);
//        s.push(5);
//        s.push(84);
//        
////        System.out.println(s.peek());
//        s.showStack();
          s.push(5);
          s.push(14);
          s.push(45);
          s.push(46);
          s.push(49);
          s.push(50);
          s.push(51);
          s.push(52);
          s.push(53);
          s.push(54);
//          s.push(55);
//          s.push(56);
          s.pop();
          s.showStack();
    }
    
}








