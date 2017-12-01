

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bikramjit Singh
 */
public class LongestCommonSubSequence {
   
    int[][] b;
    int[][] c;
    public void getLongestCommonSequence(char[] x,char[] y){
        int n=x.length;
        int m=y.length;
        b=new int[n][m];
        c=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            b[i][0]=0;
        }
        for(int i=0;i<n;i++){
            c[0][i]=0;
        }
        
        for(int i=1;i<n;i++){
          for(int j=1;j<m;j++){
              if(x[i]==y[j]){
                  c[i][j]=c[i-1][j-1]+1;
                  b[i][j]=35;
                  
               }else if(c[i-1][j]>=c[i][j-1]){
                   c[i][j]=c[i-1][j];
                   b[i][j]=40;
               }else{
                   c[i][j]=c[i][j-1];
                   b[i][j]=400;
               }
              
          }
      }  
      
        printLongestCommonSequence(x, y,n-1,m-1);
        
    }  
    public void printLongestCommonSequence(char[] x,char[] y,int n,int m){
        
        if(n==0||m==0){
            return;
        }
        if(b[n][m]==35){
            printLongestCommonSequence(x, y, n-1, m-1);
            System.out.print(x[n]+" ");
        }else if(b[n][m]==40){
            printLongestCommonSequence(x, y, n-1, m);
        }else{
            printLongestCommonSequence(x, y, n, m-1);
        }
      
    }
   
    
}
