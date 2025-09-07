// Last updated: 9/7/2025, 3:48:40 PM
class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n == 1){
            return "";
        }
        int [] arr = new int[26];
        for(int i = 0 ; i< n ; i++){
            char c = palindrome.charAt(i);
            arr[c-'a']++;
        }
        StringBuilder s =new StringBuilder(palindrome);
        
         
            for(int i = 0 ; i< n/2; i++){
                char c = s.charAt(i);
                if( c != 'a'){
                  s.insert(i,'a');
                  s.deleteCharAt(i+1);
                  return s.toString();
                }
            }
            s.insert(n-1,'b');
            s.deleteCharAt(n);
            return s.toString();
         }
    }
