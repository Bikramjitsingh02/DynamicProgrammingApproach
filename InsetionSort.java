/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vik
 */
public class InsetionSort {
    
    public static void insertionSort(int[] arr){
        int len=arr.length;
        int key;
        for(int j=1;j<len;j++){
            key=arr[j];
            int i=j-1;
            while(key<arr[i]&& i>0){
                arr[i+1]=arr[i];
                i=i-1;
                arr[i+1]=key;
                        
                    //exch(key,arr[i-1]);
                }
                
            }
            
        }
        
 /*
    public static void main(String args[]){
        int[] arr={10,76,811,2,23,4,5};
        insertionSort(arr);
        
        for(int i=0;i<arr.length;i++){
            System.err.println(arr[i]);
        }
        
    }
   */ 
}
