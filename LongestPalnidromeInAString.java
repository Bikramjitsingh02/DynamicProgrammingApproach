/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vik
 */
public class LongestPalnidromeInAString {
    
    public int getMeLongestPalindrome(char[] str,int i,int n){
        if(n==i){
            return 1;
        }
        
            if(str[i]==str[n]){
                if((i+1)==n){
                    return 3; 
                }
               return  getMeLongestPalindrome(str,i+1,n-1)+2;
             }else {
                return Integer.max(getMeLongestPalindrome(str,i+1, n), getMeLongestPalindrome(str,i, n-1));
            }
            
    }
    
}
