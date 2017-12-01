/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vik
 */
public class CuttingRod {
    
  /*  
  public static void main(String s[]){
        //int[] p={1,5,8,9,10,17,17,20,24,30};
        int[] p={1,5,8,9,10,17};
       System.out.println("this cut has : "+bottomUpCut(p,5));
         //System.out.println(p.length);
  }
    */
   public static int bottomUpCut(int p[],int n){
   int q;
       int[] r=new int[n+1];
       r[0]=0;
      
       for(int j=1;j<=n;j++){
           q=Integer.MIN_VALUE;
           for(int i=1;i<=j;i++){
               q=Math.max(q,p[i-1]+r[j-i]);
          }
          r[j]=q; 
           //System.out.println(q);
       }
       return r[n];
   }
    
    
    
}
