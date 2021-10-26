/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Hammad Ali
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[]= {1,2,3,4,5,68,78,100};
        int x=78;
        int li=0;
        int hi=a.length-1;
        int mid= (li+hi)/2;
        while (li<=hi){
            if (a[mid]==x){
                System.out.println("Element found at: " + mid + " index");
                break;
            }
            else if (a[mid]<x){
                li=mid+1;
            }
            else{
                hi=mid-1;
            }
            mid = (li+hi)/2;
        }
        
        
       
    }
}
    

