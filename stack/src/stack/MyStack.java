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
public class MyStack {
    int a[];
    int top;
    int low=0;
    int capacity;
    int res;
//    char c ;
    MyStack(int capacity){
        this.capacity=capacity;
        top=-1;
        a=new int [capacity];
    }
    boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(int data){
        if (top==capacity-1){
            System.out.println("Stack is overflowed");
        }
        else{
            top++;
            a[top]=data;
            
        }
        
    }
    int pop(){
        if (top==-1){
            System.out.println("Stack is underflow");
        }
        else{
            res=a[top];
            top--;
            
        }
        return res;
    }
    int peek(){
        if (top==-1){
            System.out.println("Stack is underflow");
        }
        else{
            return a[top];
        }
        return a[top];
    }
    void showStack(){
        int i;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
//    boolean isOpening(char x){
//        return ( c =='(' ||
//                c=='{'  ||
//                c=='[');
//    }
//    boolean isMatching(char a, char b){
//        return  ((a=='('&& b==')')||
//                (a=='{'&& b==']')||
//                (a=='[' && b=='}'));
//    }
//    boolean isParenthesisMatching (String str){
//        MyStack  s=new MyStack(10); 
//    }
}
