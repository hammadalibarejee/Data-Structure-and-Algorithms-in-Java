/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Hammad Ali
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={89,5,79,3,47,36,31,8,4,6,7,9,99,75,21,20,158,1494,456,46589,48,74,47,746};
        int temp;
        int min=0;
        int i,j;
        for (i=0;i<a.length;i++){
            min=i;
            for (j=i+1;j<a.length;j++){
                if (a[j]<a[min]){
                    min=j;
                    
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.print("[");
        for(i=0;i<a.length;i++){
            System.out.print(" "+a[i]+",");
        }
        System.out.print("]");
        
        
    }
    
}
