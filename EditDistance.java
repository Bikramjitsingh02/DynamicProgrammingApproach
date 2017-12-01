/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bikramjit singh
 */
public class EditDistance {
    int[][] M;
    int[][] B;
    int x=0;
    public void minimumEditDistance(char[] x,char[] y,int m,int n){
        M=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            M[i][0]=i;
        }
        for(int i=0;i<n;i++){
            M[0][i]=i;
        }
        
       
        System.out.println( getMinimumEditDistance(x,y,m,n));
    }
    public int minimum(int x,int y,int z){
        if(x<y){
            if(x<z){
                return x;
            }
        }else{
            if(y<z){
                return y; 
            }
        }
        return z;
    }
    
    
    public int getMinimumEditDistance(char[] x,char[] y,int m ,int n){
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(x[i]==y[j]){
                    M[i][j]=M[i-1][j-1];
                    
                }else{
                    M[i][j]=minimum(M[i-1][j]+1,M[i][j-1]+1,M[i-1][j-1])+1;
                    
                }
                
               
                
            }
        }
        return M[m-1][n-1];
    }
}
