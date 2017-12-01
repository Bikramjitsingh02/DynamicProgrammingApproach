/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vik
 */
public class LongestCommonSub {
    
    public static int calSubSequence(char[] s,char[] t,int m,int n){
        if(m==0 || n==0){
            return 0;
         }
         if(s[m-1]==t[n-1]){
                          System.out.print(s[m-1]);
             return 1+ calSubSequence(s, t, m-1, n-1);
    
         }   else  {
             
              return max(calSubSequence(s, t, m, n-1),calSubSequence(s, t, m-1, n));
         }
    }
    
    
    public static int max(int a, int b)
  {
    return (a > b)? a : b;
  }
    
    
     public static void main(String args[]){
        String s,t;
        s="saturday";
        t="sunday";
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        
        EditDistance ed=new EditDistance();
       
        ed.minimumEditDistance(str1, str2,str1.length,str2.length);
        
    }
    
}
