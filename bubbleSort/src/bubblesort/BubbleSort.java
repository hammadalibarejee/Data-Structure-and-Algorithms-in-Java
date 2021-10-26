/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Hammad Ali
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={89,5,79,3,47,36,31,8,4,6,7,9,99,75,21,20,158,1494,456,46589,48,74,47,746};
        int temp,i,j;
        for(i=0;i<a.length;i++){
            for (j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("The array: [");
        for (i=0;i<a.length;i++){
            System.out.print(" " +a[i] + " ,");    
        }
        System.out.print("]");
    }
    
}
