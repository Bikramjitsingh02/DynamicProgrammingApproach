/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Biramjit Singh
 */
public class KnapsackDP {
    int[] Q={10,20,30};
    int[] V={60,120,100};
    int[][] r;
    int q;
    
    public void getSolutionForKnap(int W,int n){
        
       int x= getSolutionForKnapsack(Q, V,W,n );
      System.out.print(x);
      // for(int i=0;i<helpingArray.length;i++){
        //  fo
          // System.out.print(helpingArray[i]+" ");
       //}
    }
    
    public int getSolutionForKnapsack(int[] Q,int[] V,int W,int n){
        
        r=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
           q=Integer.MIN_VALUE;
            for(int w=0;w<=W;w++)
            {
                q=0;
                if(i==0||w==0){
                    r[i][w]=0;
                }
                else if(Q[i]<=w){
                     r[i][w]=Integer.max(V[i]+r[i-1][w-Q[i]],r[i-1][w]);
                    
                }
                else{
                   r[i][w]=r[i-1][w];
                }
                
            }
        
        }
      return r[n][W];
    }
    
    
}
